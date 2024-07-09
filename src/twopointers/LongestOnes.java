class LongestOnes {
    public int longestOnes(int[] nums, int k) {
        int ans = 0, flips = 0;
        int i = 0; //move forward
        int j = 0; //unflip
        int len = nums.length;
        while(i < len) {
            if(nums[i] == 0) {
                flips++;
            }
            while(flips > k) {
                //unflip
                if(nums[j] == 0) {
                    flips--;
                }
                j++;
            }
            ans = Math.max(ans, i - j + 1);
            i++;
        }
        return ans;
    }
}
