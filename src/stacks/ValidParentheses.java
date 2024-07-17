class Solution {
    public boolean ValidParentheses(String s) {
       Stack<Character> st = new Stack<Character>();
       for(Character ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if(ch == ')' || ch == ']' || ch == '}') {
                if(st.empty()) {
                    return false;
                } else if((st.peek() != '[' && ch == ']')
                || (st.peek() != '(' && ch == ')')
                || (st.peek() != '{' && ch == '}')) {
                    return false;
                } else {
                    st.pop();
                }
            }
       }
       return st.empty();
    }
}
