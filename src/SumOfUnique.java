class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        int len = nums.length;
        int[] attend = new int[101];
        for(int i = 0; i < len; i++) {
            attend[nums[i]] += 1;
        }
        int sum = 0;
        for(int i = 0; i < attend.length ; i++) {
            if(attend[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
