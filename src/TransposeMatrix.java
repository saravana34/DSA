public class TransposeMatrix{
    static List<List<Integer>> solve(List<List<Integer>>  input){
        int n = input.size();
        int m = input.get(0).size();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++) {
            List<Integer> col = new ArrayList<Integer>();
            for(int j = 0; j <  m; j++) {
                col.add(input.get(j).get(i));
            }
            res.add(col);
        }
        return res;
    }
}
