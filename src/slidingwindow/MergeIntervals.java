class Solution {
    public int[][] MergeIntervals(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] temp = intervals[0];
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= temp[1]) {
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {
                ans.add(temp);
                temp = intervals[i];
            }
        } 
        ans.add(temp);
        return ans.toArray(new int[ans.size()][0]);
    }
}
