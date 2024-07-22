import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class codefile{
    static boolean solve(List<List<Integer>>  input){
        List<Set<Integer>> rows = new ArrayList<>();
        List<Set<Integer>> cols = new ArrayList<>();
        List<Set<Integer>> blocks = new ArrayList<>();  

        for(int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            blocks.add(new HashSet<>());
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int curr = input.get(i).get(j);
                if(curr == 0) {
                    continue;
                }
                if(rows.get(i).contains(curr) || cols.get(j).contains(curr) || blocks.get((i / 3) * 3 + j / 3).contains(curr)) {
                    return false;
                }
                rows.get(i).add(curr);
                cols.get(j).add(curr);
                blocks.get((i / 3) * 3 + j / 3).add(curr);
            }
        }
        return true;
    }
}
