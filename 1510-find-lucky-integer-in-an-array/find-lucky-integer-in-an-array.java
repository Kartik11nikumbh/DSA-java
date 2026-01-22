class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int large=0;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                large=Math.max(large,entry.getKey());
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