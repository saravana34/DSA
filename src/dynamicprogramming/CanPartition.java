class CanPartition {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        if(sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean dp[][] = new boolean[n + 1][target + 1];
        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < target + 1; j++) {
                if(i == 0) {
                    dp[i][j] = false;
                } 
                if(j == 0) {
                    dp[i][j] = true;
                }
            }
        }
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < target +1; j++) {
                if(nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][target];
    }
}
