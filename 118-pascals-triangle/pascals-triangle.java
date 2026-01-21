class Solution {
    public List<List<Integer>> generate(int numRows) {
        int b=1;
        List<List<Integer>> list=new ArrayList<>();
		for(int i=1;i<=numRows;i++){
			int n=1;
            List<Integer> list1=new ArrayList<>();
			for(int j=1;j<=b;j++){
				list1.add(n);
				n=n* (i-j)/j;
			}
            list.add(list1);
        
			System.out.println();
			
			b++;
        }
        return list;
    }
}