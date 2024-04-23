import java.util.Arrays;
import java.util.Scanner;

public class MaxAscendingSum {
  public static void main(String[] args) {
        int[] inputArr = { 10, 20, 30, 40, 50 };
        System.out.println("Maximum ascending sum is " + maxAscendingSum(inputArr));
    }

    public int maxAscendingSum(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return nums[0];
        int maxSum = 0;
        int sum = nums[0];
        for(int i = 1; i < len; i++) {
            if(nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                if(maxSum < sum) {
                    maxSum = sum;
                }
                sum = nums[i];
            }
            if(maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
