public class TrailingZeroes{
    static inttTrailingZeroes(int n){
        int zeros = 0;
		    while((n & 1) == 0) {
            zeros++;
            n >>= 1;
        }
        return zeros;
    }
}
