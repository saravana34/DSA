class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            int count = 0;
            for(int j = 0; j < len; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
