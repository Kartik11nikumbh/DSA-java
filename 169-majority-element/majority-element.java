class Solution {
    public int majorityElement(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int key=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                key=entry.getKey();
                max=entry.getValue();
            }
        }
        return key;
    }
}