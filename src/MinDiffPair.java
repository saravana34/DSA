public class MinDiffPair{
    static int solve(int[]  input){
        Arrays.sort(input);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < input.length; i++) {
            min = Math.min((input[i] - input[i - 1]), min);
        }
        return min;
    }
}
