class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int firstMax = Integer.MIN_VALUE;;
        int secondMax = Integer.MIN_VALUE;;
        for(int i = 0; i < len; i++) {
            if(secondMax < nums[i]) { 
                int tmp = secondMax;
                secondMax = nums[i];
                if(firstMax < tmp) {
                    firstMax = tmp;
                }
            } else if(firstMax < nums[i]){
                firstMax = nums[i];
            }
        }
        return ((firstMax - 1) * (secondMax - 1));
    }
}
