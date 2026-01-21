class Solution {
    public List<String> removeAnagrams(String[] words) {
       List<String> result = new ArrayList<>();
        String prev = "";

        for (String word : words) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String curr = new String(ch);

            if (!curr.equals(prev)) {
                result.add(word);
                prev = curr;
            }
        }

        return result;
       
    }
}