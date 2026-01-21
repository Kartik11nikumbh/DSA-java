class Solution {
    public List<List<Integer>> generate(int numRows) {
        int b=1;
        List<List<Integer>> list=new ArrayList<>();
		for(int i=0;i<numRows;i++){
            List<Integer> list1=new ArrayList<>();
			for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list1.add(1);
                }
                else{
                    int val = list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    list1.add(val);
                }
			}
            list.add(list1);			
			b++;
        }
        return list;
    }
}