class SumFourDivisors {
    public int sumFourDivisors(int[] nums) {
        /*int len = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            int sum = 0;
            int counter = 0;
            int n = nums[i];
            for(int j = 1; j <= n; j++) {
                if(n % j == 0){
                    counter++;
                    sum += j;
                }
                if(counter > 4) {
                    sum = 0;
                    break;
                }
            }
            if(counter < 4) {
                res.add(0);
            } else {
                res.add(sum);
            }
        }
        Integer sol = 0;
        for(Integer a : res) {
            sol += a;
        }
        return sol;*/
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            int sumOfDivisors = 0;
            for(int j = 1; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    if(j * j == num) {
                        count++;
                        sumOfDivisors += j;
                    } else {
                        count += 2;
                        sumOfDivisors += (j + (num / j));
                    }
                }
            }
            if(count == 4) {
                sum += sumOfDivisors;
            }
        }
        return sum;
    }
}
