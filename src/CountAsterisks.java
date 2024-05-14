class CountAsterisks {
    public int countAsterisks(String s) {
        int j = 0, count = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == '*') {
                count++;
            }
            if(s.charAt(i) == '|') {
                j = i + 1;
                while(s.charAt(j) != '|') {
                    j++;
                }
                i = j;
            }
        }
        return count;
    }
}
