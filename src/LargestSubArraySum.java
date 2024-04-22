import java.util.Arrays;
import java.util.Scanner;

// Kadane’s Algorithm
public class LargestSubArraySum {
  public static void main(String[] args) {
        int[] inputArr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is " + subArraySum(inputArr));
    }

    public static int subArraySum(int arr[]) {
        int len = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            sum += arr[i];
            if(maxSum < sum)
                maxSum = sum;
            if(sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}
