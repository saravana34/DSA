class CanMakeArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] input) {
        int len = input.length;
        if(len == 1)
            return true;
        Arrays.sort(input);
        int diff = input[1] - input[0];
        for(int i = 2; i < len; i++) {
            if(input[i] - input[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
}
