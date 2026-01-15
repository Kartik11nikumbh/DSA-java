class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==2){
            if(k%2==1){
                int temp=nums[0];
                nums[0]=nums[1];
                nums[1]=temp;
                
            }
            
        }
       
        else{
            k %= nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
      
    }
    public static int[] reverse(int arr[],int left,int right){
        
        if(arr.length<2){
            return arr;
        }
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
}