class LeftRightDifference {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int leftSum = 0;
        int []leftSumArr = new int[len];
        int rightSum = 0;
        int []rigthSumArr = new int[len];
        int []diff = new int[len];
        for(int i = 0; i < len; i++) {
            leftSumArr[i] = leftSum;
            leftSum += nums[i];
        }
        for(int i = len - 1; i >= 0; i--) {
            rigthSumArr[i] = rightSum;
            rightSum += nums[i];
        }
        for(int i = 0; i < len; i++) {
            int diffr = leftSumArr[i] - rigthSumArr[i];
            if(diffr < 0) {
                diffr = diffr * -1;
            }
            diff[i] = diffr;
        }
        return diff;
    }
}
