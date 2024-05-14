class ReplaceDigits {
    public String replaceDigits(String s) {
        char[] ans = s.toCharArray();
        int len = ans.length;
        for(int i = 1; i < len; i += 2) {
            ans[i] = (char) (ans[i - 1] + ans[i] - '0');
        }
        return new String(ans);
    }
}
