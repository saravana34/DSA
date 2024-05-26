class SimilarPairs {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                count += check(words[i], words[j]);
            }
        }
        return count;
    }
    private int check(String a, String b) {
        HashSet<Character> set1 = new HashSet<>();
        for(char ch : a.toCharArray()) {
            set1.add(ch);
        }
        HashSet<Character> set2 = new HashSet<>();
        for(char ch : b.toCharArray()) {
            set2.add(ch);
        }
        return set1.equals(set2) ? 1 : 0;
    }
}
