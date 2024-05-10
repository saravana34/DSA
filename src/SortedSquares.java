class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] sqSorted = new int[len];
        for(int i = 0; i < len; i++) {
            sqSorted[i] = nums[i]*nums[i];
        }
        Arrays.sort(sqSorted);
        return sqSorted;
    }
}
