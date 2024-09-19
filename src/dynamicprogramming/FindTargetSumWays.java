class Solution {
    public int findTargetSumWays(int[] nums, int target1) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        if(Math.abs(target1) > sum) {
            return 0;
        }
        if((sum+target1) % 2 != 0) {
            return 0;
        }
        int target = (sum + target1) / 2;
        int dp[][] = new int[n + 1][target + 1];
        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < target + 1; j++) {
                if(i == 0) {
                    dp[i][j] = 0;
                } 
                if(j == 0) {
                    dp[i][j] = 1;
                }
            }
        }
        dp[0][0] = 1;
        for(int i = 1; i < n + 1; i++) {
            for(int j = 0; j < target + 1; j++) {
                if(nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][target];

    }
}
