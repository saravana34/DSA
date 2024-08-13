class SquareRoot {
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        int low = 1, high = x, ans = 1;
        long mid;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if(mid * mid <= x) {
                ans = (int)mid;
                low = (int)mid + 1;
            } else {
                high = (int)mid - 1;
            }
        }
        return ans;
    }
}
