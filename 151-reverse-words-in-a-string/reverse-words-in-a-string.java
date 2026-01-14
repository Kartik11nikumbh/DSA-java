class Solution {
    public String reverseWords(String s) {
        String trim=s.trim();
		String []sr=trim.split("\\s+");
		int i=0;
		int j=sr.length-1;
		while(i<j) {
			
			String temp=sr[i];
			sr[i]=sr[j];
			sr[j]=temp;
			i++;
			j--;
		}
        return String.join(" ",sr);
		
    }
}