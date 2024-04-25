class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> tempList = new ArrayList<>();
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            tempList.add(index[i], nums[i]);
        }
        for(int i = 0; i < result.length; i++) {
            result[i] = tempList.get(i);
        }
        return result;
    }
}
