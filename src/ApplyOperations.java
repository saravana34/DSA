class ApplyOperations {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int i = 0, j = 0;
        while(j < len) {
            if(nums[j] != 0) {
                nums[i++] = nums[j];
            }
            j++;
        }
        while(i < len) {
            nums[i++] = 0;
        }
        return nums;
    }
}
