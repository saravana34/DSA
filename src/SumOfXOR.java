public class SumOfXOR{
    static int sum(int[]  input){
        int bits = 0;
        for(int i = 0; i < input.length; i++) {
            bits = bits | input[i];
        }
        int ans = bits * (int) Math.pow(2, input.length - 1);
        return ans;
    }
}
