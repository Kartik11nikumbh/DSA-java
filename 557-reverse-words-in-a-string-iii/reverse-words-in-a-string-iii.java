class Solution {
    public static String reverse(String s){
        char [] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch); 
    }
    public String reverseWords(String s) {
        String [] srr=s.split(" ");
        for(int i=0;i<srr.length;i++){
            srr[i]=reverse(srr[i]);
        }
        String res=String.join(" ",srr);
        return res;
    }
}