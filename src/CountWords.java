class CountWords {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> hm1 = new HashMap<>();
        Map<String, Integer> hm2 = new HashMap<>();
        int out = 0;
        for(String s : words1) {
            hm1.put(s, hm1.getOrDefault(s, 0) + 1);
        }
        for(String s : words2) {
            hm2.put(s, hm2.getOrDefault(s, 0) + 1);
        }
        for(HashMap.Entry<String, Integer> i : hm1.entrySet()) {
            if(i.getValue() == 1 && hm2.getOrDefault(i.getKey(), 0) == 1){
                out++;
            }
        }
        return out;
    }
}
