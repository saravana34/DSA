class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < len1 || i < len2) {
            if(i < len1) {
                sb.append(word1.charAt(i));
            }
            if(i < len2) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
