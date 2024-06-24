class BubbleSort {
    public void sortColors(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len -1 ; i++) {
            for(int j = 0; j < len - i - 1; j++) {
                if(nums[j] > nums[j+1]) {
                    int t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
            }
        }
    }
}
