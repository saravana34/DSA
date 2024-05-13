public class MaxLen{
    static int maxLen(int[]  input){
        int maxLen = 0;
        int len = input.length;
        for(int i = 0; i < len; i++) {
            int curSum = 0;
            for(int j = i; j < len; j++) {
                curSum += input[j];
                if(curSum == 0){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
