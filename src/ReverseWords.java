class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int len = words.length;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < len; i++) {
            ans.append(new StringBuilder(words[i]).reverse());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
