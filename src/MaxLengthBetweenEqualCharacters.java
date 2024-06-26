class MaxLengthBetweenEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] last = new int[26];
        int ans = -1;
        for(int i = 0; i < s.length(); ++i) last[s.charAt(i) - 'a'] = i;
        for(int i = 0; i < s.length(); ++i) ans = Math.max(ans, last[s.charAt(i) - 'a'] - i - 1);
        return ans;
    }
}
