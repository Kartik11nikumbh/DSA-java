import java.util.*;

class Solution {

    public void backtrack(List<List<Integer>> result,
                          List<Integer> temp,
                          int[] nums,
                          boolean[] used) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used
            if (used[i]) continue;

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            temp.add(nums[i]);
            used[i] = true;

            backtrack(result, temp, nums, used);

            // Undo
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums); // Important for duplicates

        boolean[] used = new boolean[nums.length];

        backtrack(result, new ArrayList<>(), nums, used);

        return result;
    }
}

