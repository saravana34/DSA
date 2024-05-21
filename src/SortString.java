class SortString {
    public String sortString(String s) {
        int[] freq = new int[26];
        int len = s.length();
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(len != 0) {
            for(i = 0; i < 26; i++) {
                if(freq[i] > 0) {
                    sb.append((char)(i + 'a'));
                    freq[i]--;
                    len--;
                }
            }
            for(i = 25; i >= 0; i--) {
                if(freq[i] > 0) {
                    sb.append((char)(i + 'a'));
                    freq[i]--;
                    len--;
                }
            }
        }
        return sb.toString();
    }
}
