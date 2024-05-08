class DIStringMatch {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int[] perm = new int[len + 1];
        int low = 0;
        int high = len;
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == 'I') {
                perm[i] = low++;
            } else if(s.charAt(i) == 'D') {
                perm[i] = high--;
            }
        }
        perm[len] = high;
        return perm;
    }
}
