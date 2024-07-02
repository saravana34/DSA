class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int sum =0, mul = 1;
        while(n > 0) {
            int a = n % 10;
            mul *= a;
            sum += a;
            n /= 10;
        }
        return mul - sum;
    }
}
