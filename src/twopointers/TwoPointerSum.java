class Solution {
    public int[] TwoPointerSum(int[] numbers, int target) {
        int len = numbers.length;
        int low = 0, high = len - 1;
        while(low < high) {
            int sum = numbers[low] + numbers[high];
            if(sum == target) {
                return new int[]{low + 1, high + 1};
            }
            if(sum < target){
                low++;
            } else {
                high--;
            }
        }
        return new int[]{ -1, -1};
    }
}
