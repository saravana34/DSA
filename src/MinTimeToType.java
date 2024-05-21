class MinTimeToType {
    public int minTimeToType(String word) {
        int count = word.length();
        int len = word.length();
        char prev = 'a';
        for(int i = 0; i < len; i++) {
            char cur = word.charAt(i);
            int diff = Math.abs(cur - prev);
            count += Math.min(diff, 26 - diff);
            prev = cur;
        }
        return count;
    }
}
