class PercentageLetter {
    public int percentageLetter(String s, char letter) {
        int len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(letter == s.charAt(i)) {
                count++;
            }
        }
        return (int)Math.floor((double)(count* 100)/len);
    }
}
