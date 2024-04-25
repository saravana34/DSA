class Solution {
    public int mostWordsFound(String[] sentences) {
       int len = sentences.length;
       int max = -1;
       for(int i = 0; i < len; i++) {
            String[] sen = sentences[i].split(" ");
            int senLen = sen.length;
            if(max < senLen) {
                max = senLen;
            }
       }
       return max;
    }
}
