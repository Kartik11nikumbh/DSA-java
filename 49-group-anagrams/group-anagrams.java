class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
		List<List<String>> group= group(strs);
		return group;
    }
    public static List<List<String>> group(String [] str){
		
		Map<String,List<String>> map= new HashMap<>();
		for(int i=0;i<str.length;i++) {
			char [] ch=str[i].toCharArray();
			Arrays.sort(ch);
			String temp= new String(ch);
			if(map.containsKey(temp)) {
				map.get(temp).add(str[i]);
			}
			else {
				List<String> list=new ArrayList<>();
				list.add(str[i]);
				map.put(temp, list);
			}
		}
		List<List<String>> res = new ArrayList<>();
		for(Map.Entry<String, List<String>> e : map.entrySet()) {
			res.add(e.getValue());
		}
		return res;
	}
}