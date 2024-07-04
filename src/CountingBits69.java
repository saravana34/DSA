public class CountingBits69 {
    static int[] solve(int n){
        int[] ans = new int[n + 1];
        // iterating from 0 to n
        for (int i = 0; i <= n; i++) {
            // sum is initialized as 0
            int sum = 0, num = i;
            // while num not equals zero
            while (num != 0) {
                // we have to count 1's in binary representation of i, therefore % 2
                sum += num % 2;
                num = num / 2;
            }
            // add sum to ans array
            ans[i] = sum;
        }
        // return
        return ans;
    }
}
