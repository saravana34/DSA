class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if(dividend == 0) {
            return 0;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        long start = 0, end = absDividend;
        long result = 0;

        while(start <= end) {
            long mid = start + (end - start) / 2;
            if(mid * absDivisor <= absDividend) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        result = isNegative ? -result : result;
        if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
