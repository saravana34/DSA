public class ReverseBits{
    static long solve(String s){
		long res = 0;
        for(int i = 31; i >= 0; i--) {
            res <<= 1;
            res += (s.charAt(i) - '0') % 2;
        }
        return res;
    }
}
