class MinDeletionSize {
    public int minDeletionSize(String[] strs) {
        int len = strs[0].length();
        int del = 0;
        for(int i = 0; i < len; i++) {
            char prev = '0';
            for(String s : strs) {
                char cur = s.charAt(i);
                if(cur < prev) {
                    del++;
                    break;
                }
                prev = cur;
            }
        }
        return del;
    }
}
