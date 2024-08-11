class FindMin {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n -1;
        if(nums[low] <= nums[high]) {
            return nums[0];
        }
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if(nums[low] <= nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
