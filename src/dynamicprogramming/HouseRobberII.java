class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < n - 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        int[] dp2 = new int[n];
        dp2[0] = 0;
        dp2[1] = nums[1];
        for(int i = 2; i < n; i++){
            dp2[i] = Math.max(dp2[i - 1], nums[i] + dp2[i - 2]);
        }
        return Math.max(dp[n - 2], dp2[n - 1]);
    }
}
