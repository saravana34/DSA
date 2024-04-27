class Solution {
    public int differenceOfSum(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int digitSum = 0;
        for(int i = 0; i < len; i++) {
            sum += nums[i];
            int n = nums[i];
            int x;
            while(n > 0) {
                x = n % 10;
                digitSum += x;
                n = n /10;
            }
        }
        return sum - digitSum;
    }
}
