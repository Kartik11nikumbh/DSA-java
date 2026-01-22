class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
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