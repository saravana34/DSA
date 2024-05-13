class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch >= 65 && ch <= 90) {
                char a = (char)(ch + 32);
                ans.append(a);
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
