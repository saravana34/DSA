class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str = new String[]{
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> res = new HashSet<>();
        for(String s : words) {
             StringBuilder sb = new StringBuilder();
             for(char c : s.toCharArray()){
                sb.append(str[c-'a']);
            }
            res.add(sb.toString());
        }
        return res.size();
    }
}
