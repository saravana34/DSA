class FindWords {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        int len = words.length;
        List<String> res = new ArrayList<>();
        for(String word: words) {
            int r1=0,r2=0,r3=0;
            for(int i = 0; i < word.length(); i++) {
                String s = word.toLowerCase();
                if(row1.contains(Character.toString(s.charAt(i)))) {
                    r1++;
                } else if(row2.contains(Character.toString(s.charAt(i)))) {
                    r2++;
                } else {
                    r3++;
                }
                if(r1 == word.length() || r2 == word.length() || r3 == word.length()) {
                    res.add(word);
                }
            }
        }
        String[] array = new String[res.size()];
        for(int i = 0; i < array.length; i++) {
            array[i] = res.get(i);
        }
        return array;
    }
}
