class CountKDifference {
    public int countKDifference(int[] nums, int k) {
        int len = nums.length;
        int ans = 0;
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] - nums[j] == k || nums[j] - nums[i] == k) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
