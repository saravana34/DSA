public class ReverseBits{
    static long solve(String s){
	long res = 0;
        for(int i = 31; i >= 0; i--) {
            res <<= 1;
            res += (s.charAt(i) - '0') % 2;
        }
        return res;
	/*
 	int ans = 0;
        for(int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
 	*/
    }
}
