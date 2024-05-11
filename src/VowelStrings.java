class VowelStrings {
    public int vowelStrings(String[] words, int left, int right) {
        int len = words.length;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for(int i = left; i <= right; i++) {
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }
}
