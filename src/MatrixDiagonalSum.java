public class MatrixDiagonalSum{
    static int solve(List<List<Integer>>  input){
        int sum = 0;
        int r = input.size();
        for(int i = 0; i < input.size(); i++){
           sum += input.get(i).get(i) + input.get(i).get(r-i-1);
        }
        if(r % 2 != 0) {
            sum -= input.get(r/2).get(r/2);
        }
        return sum;
    }
}
