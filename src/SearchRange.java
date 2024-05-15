class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, second = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == target && first == -1) {
                first = i;
                second = i;
            } else if(nums[i] == target){
                second = i;
            }
        }
        int[] ans = {first, second};
        return ans;
    }
}
