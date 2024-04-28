public class FlippingAnImage {
    static List<List<Integer>> solve(List<List<Integer>>  input){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(List<Integer> list1 : input) {
            List<Integer> inner = new ArrayList<Integer>();
            for(Integer list2 : list1) {
                inner.add(list2 == 1 ? 0 : 1);
            }
            List<Integer> inner1 = new ArrayList<Integer>();
            for(int i = inner.size()-1; i >= 0; i--) {
                inner1.add(inner.get(i));
            }
            res.add(inner1);
        }
        return res;
    }
}
