public class Search2DMatrix{
    static boolean solve(List<List<Integer>>  input,int target){
        int i = 0;
        int j = input.get(0).size() - 1;
        while(i < input.size() && j >= 0) {
             if(input.get(i).get(j) == target) {
                  return true;
             }
             if(input.get(i).get(j) < target) {
                  i++;
             } else {
                  j--;
             }
        }
        return false;
    }
}
