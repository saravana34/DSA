class MinOperations {
    public int minOperations(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] < k && nums[i] != -1) {
                nums[i] = -1;
                count++;
            }
        }
        return count;
    }
}
