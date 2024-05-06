class NumberOfSteps {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num > 0) {
            if(num % 2 != 0) {
                num = num - 1;
                count++;
            } else {
                count++;
                num = num/2;
            }
        }
        return count;
    }
}
