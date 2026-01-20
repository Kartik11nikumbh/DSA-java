class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }while(slow !=fast);
        int n1=0,n2=slow;
        while(n1!=n2){
            n1=nums[n1];
            n2=nums[n2];
        }
        return n1;





















        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:nums){
        //     if(map.containsKey(i)){
        //         return i;
        //     }
        //     else{
        //         map.put(i,1);
        //     }
        // }
        // return 0;
    }
}