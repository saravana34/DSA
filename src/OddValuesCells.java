public class OddValuesCells{
    static int solve(int n,int m, List<List<Integer>>  input){
        boolean[] n1 = new boolean[n];
        boolean[] m1 = new boolean[m];

        for(List<Integer> index : input) {
            n1[index.get(0)] ^= true;
            m1[index.get(1)] ^= true;
        }
        int r = 0, c = 0;
        for(boolean b : n1) {
            if(b) {
                r++;
            }
        }
        for(boolean b : m1) {
            if(b) {
                c++;
            }
        }
        return r * m + c * n - 2 * r * c;
    }
}
