/*
  multiply with 2 and incr count
*/
public class ReversePair {
    static int solve(int[]  input){
        int len = input.length;
        long reversePair = 0;
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {
                if(input[i] > 2 * (long)input[j]) {
                    reversePair++;
                }
            }
        }
        return (int)reversePair;
    }
}
