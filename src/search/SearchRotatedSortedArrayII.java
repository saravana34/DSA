class SearchRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int mid;
        while(low < high) {
            mid = (low + high) / 2;
            if(nums[mid] == target) {
                return true;
            }
            if(nums[low] == nums[mid] && nums[high] == nums[mid]) {
                //duplicates
                low++;
                high--;
            } else if(nums[low] <= nums[mid]){
                //sorted first part
                if(nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                //sorted 2nd part
                if(nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
