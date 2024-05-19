class CanBeTypedWords {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] textArr = text.split(" ");
        int len = textArr.length;
        Set<Integer> hset = new HashSet<>();
        char[] charArr = brokenLetters.toCharArray();
        int bLen = brokenLetters.length();
        for(int i = 0; i < bLen; i++) {
            char c = brokenLetters.charAt(i);
            for(int j = 0; j < len; j++) {
                if(textArr[j].contains(Character.toString(c))) {
                    hset.add(j);
                }
            }
        }
        return len - hset.size();
    }
}
