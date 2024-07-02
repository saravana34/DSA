class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0, len = nums.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if(count > max) {
                max = count;
            }
        }
        return max;
    }
}
