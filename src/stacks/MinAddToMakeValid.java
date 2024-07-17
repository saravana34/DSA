class MinAddToMakeValid {
    public int minAddToMakeValid(String s) {
        int len = s.length();
        int open = 0;
        int close = 0;
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                open++;
            } else {
                if(open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }
        return open + close;
    }
}
