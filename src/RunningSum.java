public class RunningSum {
    public static void main(String[] args) {
        int[] inputArr = { 4, 1, 2, 3, 4};
        System.out.println("Running sum is " + runningSum(inputArr));
    }

    public static int[] runningSum(int input[]) {
        int sum = 0;
        for(int i = 0; i < input.length; i++) {
            sum += input[i];
            input[i] = sum;
        }
        return input;
    }
}
