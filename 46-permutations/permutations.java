class Solution {
    public void backtrack(List<List<Integer>> resultList,ArrayList<Integer> temp,int []nums){
        if(temp.size()==nums.length){
            resultList.add(new ArrayList<>(temp));
            return;
        }
        for(int number:nums){
            if(temp.contains(number)){
                continue;
            }
            temp.add(number);
            backtrack(resultList,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList,new ArrayList<>(),nums);
        return resultList;
    }
}
