class Solution {
    public static int count(int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int max=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(count(nums[i])%2==0){
                c++;
                max=Math.max(max,c);
            }
        }
        return max;
    }
}