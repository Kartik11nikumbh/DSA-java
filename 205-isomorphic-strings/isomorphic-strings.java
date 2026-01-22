class Solution {
    public boolean isIsomorphic(String s, String t) {
        LinkedHashMap<Character,Character> map1=new LinkedHashMap<>();
        LinkedHashMap<Character,Character> map2=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            // for s string
            if(map1.containsKey(sc)){
                if(map1.get(sc)!=tc){
                    return false;
                }
            }
            else{
                map1.put(sc,tc);
            }

            //for t string
            if(map2.containsKey(tc)){
                if(map2.get(tc) != sc){
                    return false;
                }
            }
            else{
                map2.put(tc,sc);
            }
        }
        return true;
    }
}