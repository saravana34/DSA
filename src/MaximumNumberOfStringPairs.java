class MaximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        int len = words.length;
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
