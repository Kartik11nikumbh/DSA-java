class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        double maxavg=(sum/k);
        int sidx=0;
        int eidx=k;
        int c=0;
        if(maxavg>=threshold)
                c++;
        while(eidx<arr.length){
            sum-=arr[sidx];
            sidx++;
            sum+=arr[eidx];
            eidx++;
            maxavg =sum/k; 
            if(maxavg>=threshold)
                c++;
        }
        return c;
    }
}