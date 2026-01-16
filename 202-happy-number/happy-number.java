class Solution {
    public static int sumOfSquare(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld*ld;
            n/=10;

        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        else if(n==4){
            return false;
        }
        else{
            return isHappy(sumOfSquare(n));
        }
    }
}