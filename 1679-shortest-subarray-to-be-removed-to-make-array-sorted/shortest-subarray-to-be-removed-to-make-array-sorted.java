class Solution {
    public int findLengthOfShortestSubarray(int[] a) {
         if(a.length==1){
           return 0;
        }
        int l =0;
        while(l<a.length-1 && a[l]<=a[l+1]){
            l++;
        }
        if(l==a.length-1){
            return 0;
        }
        int r = a.length-1;
        while(r>0 && a[r]>=a[r-1]){
            r--;
        }
        int res = Math.min(a.length-l-1, r);
        int i =0;
        int j =r;
        while(i<=l && j<a.length){
            if(a[i]<=a[j]){
                res = Math.min(res, j-i-1);
                i++; 
            }
            else{
            j++;
            }
           
        }
        return res;
    }
}