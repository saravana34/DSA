class TargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] == target)
                res.add(i);
        }
        return res;
    }
}
