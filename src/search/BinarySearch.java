class BinarySearch {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int mid = 0, low = 0, high = len - 1;
        while(low <= high) {
            mid = (low + high) / 2;
            if(nums[mid] == target) {
                return mid;
            }else if(target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
