class Solution {
    public static boolean isNotRepeat(String s){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.add(s.charAt(i))){
                return false;
            } 
        }
        return true;
    } 
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<=s.length()-3;i++){
            if(isNotRepeat(s.substring(i,i+3))){
                c++;
            }
        }
        return c;
    }
}