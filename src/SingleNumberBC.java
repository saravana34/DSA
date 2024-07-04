public class SingleNumberBC{
    static int find(int[]  input){
        int sum = 0;
        for(int i : input) {
            sum = (sum ^ i);
        }
        return sum;
    }
}
