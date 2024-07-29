public class FindRedundant{
    static boolean check(String s){
		Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for(char ch : str) {
            if(ch == ')') {
                char top = st.peek();
                st.pop();
                boolean flag = true;
                while(!st.empty() && top != '(') {
                    if(top == '+' || top == '-' || top == '*' || top == '/') {
                        flag = false;
                    }
                    top = st.peek();
                    st.pop();
                }
                if(flag == true) {
                    return true;
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}
