class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> index = new ArrayList<Integer>();
        int len = words.length;
        for(int i = 0; i < len; i++) {
            if(words[i].indexOf(x) != -1) {
                index.add(i);
            }
        }
        return index;
    }
}
