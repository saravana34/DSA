class CountVowelSubstrings {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int len = word.length();
        for(int i = 0; i < len; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for(int j = i; j < len && isVowel(word.charAt(j)); j++) {
                map.put(word.charAt(j), map.getOrDefault(word.charAt(j), 0) + 1);
                if(map.size() == 5) {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
