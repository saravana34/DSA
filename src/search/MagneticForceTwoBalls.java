class Solution {
    public int MagneticForceTwoBalls(int[] input, int m) {
        int ans = 0;
        int low = 0, high = Integer.MAX_VALUE;
        Arrays.sort(input);
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int count = 1;
            int check = input[0];
            for(int i = 1; i < input.length; ++i) {
                if(input[i] - check >= mid) {
                    count++;
                    check = input[i];
                }
            }
            if(count >= m) {
                ans = Math.max(ans, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
