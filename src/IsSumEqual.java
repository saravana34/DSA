class IsSumEqual {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);
    }
    public static int getValue(String s) {
        int result = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            result = result * 10 + (s.charAt(i) - 'a');
        }
        return result;
    }
}
