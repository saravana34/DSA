class FirstUniqChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int len = s.length();
        for(char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < len; i++) {
            if(mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
