class NumOfStrings {
    public int numOfStrings(String[] patterns, String word) {
        int len = patterns.length;
        int count = 0;
        for(int i = 0; i < len;i++) {
            if(word.indexOf(patterns[i]) != -1) {
                count++;
            }
        }
        return count;
    }
}
