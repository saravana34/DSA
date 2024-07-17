class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int ans = 0;
        int len = s.length();
        for(Character ch : s.toCharArray()){
            if(ch == '(') {
                open++;
            } else {
                close++;
            }
            if(open < close) {
                open = 0;
                close = 0;
            }
            if(open == close) {
                ans = Math.max(open + close , ans);
            }
        }
        open = 0;
        close = 0;
        for(int i = len - 1; i >= 0; i--){
            if(s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if(open > close) {
                open = 0;
                close = 0;
            }
            if(open == close) {
                ans = Math.max(open + close , ans);
            }
        }
        return ans;
    }
}
