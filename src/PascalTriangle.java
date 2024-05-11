class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            res.add(getVal(i));
        }
        return res;
    }
    public static List<Integer> getVal(int num) {
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i <= num; i++) {
            long x = 1L;
            for(int j = 0; j < i; j++) {
                x *=(num - j);
                x /= (j+1);
            }
            row.add((int) x);
        }
        return row;
    }
}
