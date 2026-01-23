class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int large=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(!set.add(s.charAt(j))){
                    set.clear();
                    break;
                }
                large=Math.max(large,set.size());
            }
            set.clear();
        }
        return large;
       
        
    }
}