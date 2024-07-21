class Flipgame {
    public int flipgame(int[] input1, int[] input2) {
        int[] count = new int[2001];
        int res = Integer.MAX_VALUE;
        int len = input1.length;
        for(int i = 0; i < len; i++) {
            if(input1[i] == input2[i]) {
                count[input1[i]]++;
            }
        }
        for(int i = 0; i < len; i++) {
            if(count[input1[i]] == 0) {
                res = Math.min(res, input1[i]);
            }
            if(count[input2[i]] == 0) {
                res = Math.min(res, input2[i]);
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
