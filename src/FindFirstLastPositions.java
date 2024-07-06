public class FindFirstLastPos{
    static int[] solve(int[] nums,int target){
        int n = nums.length;
        int start = -1, end = -1;
        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                start = i;
                break;
            }
        }
        for(int i = n - 1; i >= 0; --i) {
            if(nums[i] == target) {
                end = i;
                break;
            }
        }
        return new int[]{start, end};
    }
}
