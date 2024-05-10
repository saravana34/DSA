class SingleNumber {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int unique = 0;
        for(int i = 0; i < len; i++) {
            unique = unique ^ nums[i];
        }
        return unique;
    }
}
