public class ArrayConcatenation {
    public static void main(String[] args) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col1 = new ArrayList<>();
        col1.add(1);
        col1.add(5);
        row.add(col1);
        List<Integer> col2 = new ArrayList<>();
        col2.add(7);
        col2.add(3);
        row.add(col2);
        List<Integer> col3 = new ArrayList<>();
        col3.add(3);
        col3.add(5);
        row.add(col3);
        System.out.println("Max sum from mxn matrix " + getMaxSumFromMXNMatrix(row));
    }

    public static int[] getMaxSumFromMXNMatrix(List<List<Integer>> input) {
        List<Integer> sumList = new ArrayList<>();
        for(List<Integer> in : input) {
            int sum = 0;
            for(Integer i : in) {
                sum += i;
            }
            sumList.add(sum);
        }
        int max = 0;
        for(Integer sum : sumList) {
            if(max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
