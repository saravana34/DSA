class GCD {
    public int findGCD(int[] nums) {
         int min = 9999;
         int max = -1;
         for(int i = 0; i < nums.length; i++) {
            if(min > nums[i]) {
                min = nums[i];
            }
            if(max < nums[i]) {
                max = nums[i];
            }
         }
         return gcdRec(min, max);
    }
     public static int gcdRec(int a, int b) {
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        if(a == b)
            return a;
        if(a > b) {
            if(a % b == 0)
                return b;
            return gcdRec(a - b, b);
        }
        if(b % a == 0) {
            return a;
        }
        return gcdRec(a, b - a);
    }
}
