class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else {
                st.pop();
                if (st.size() != 0) {
                    sb.append(ch);
                    continue;
                }
            }

            if (st.size() > 1 && i < l - 1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}