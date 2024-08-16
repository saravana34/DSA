public class SumOfTwoInteger{
    static int sum(int a,int b){
		int c;
        while(b != 0) {
            c = (a & b);
            a = a ^ b;
            b = (c) << 1;
        }
        return a;
    }
}
