class SelectionSort {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len - 1; i++) {
            int min = i;
            for(int j = i + 1; j < len; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }
            int t = nums[min];
            nums[min] = nums[i];
            nums[i] = t;
        }
        return nums;
    }
}
