public class NumberOfOddEvenBits{
    static int[] solve(int n){
        int a = 0, b = 0;
        int c = 0;
        while (n > 0) {
            if (c % 2 == 0) {
                if ((n % 2) == 1) {
                    a++;
                }
            } else {
                if ((n % 2) == 1) {
                    b++;
                }
            }
            n = n / 2;
            c++;
        }
        return new int[]{a, b};
    }
}
