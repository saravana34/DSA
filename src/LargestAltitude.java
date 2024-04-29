class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int max = 0, sum = 0;
        for(int i = 0; i < len; i++) {
            sum += gain[i];
            if(max < sum) {
                max = sum;
            }
         }
         return max;
    }
}
