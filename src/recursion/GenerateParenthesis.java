class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        getPatterns(res, 0, 0, "", n);
        return res;
    }

    void getPatterns(List<String> res, int open, int close, String s, int n) {
        if(s.length() == n * 2) {
            res.add(s);
            return;
        }
        if(open < n) {
            getPatterns(res, open + 1, close, s + "(", n);
        }
        if(open > close) {
            getPatterns(res, open, close + 1, s + ")", n);
        }
    }
}
