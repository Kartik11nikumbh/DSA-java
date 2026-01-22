class Solution {
    public static boolean isLucky(int [] arr,int n){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                c++;
            }
        }
        if(c==n){
            return true;
        }
        else{
            return false;
        }
    }
    public int findLucky(int[] arr) {
        int large=0;
        for(int i=0;i<arr.length;i++){
            if(isLucky(arr,arr[i]) && large<arr[i]){
                large=arr[i];
            }
        }
        if(large==0){
            return -1;
        }
        else{
            return large;
        }
    }
}