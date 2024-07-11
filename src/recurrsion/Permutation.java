class Permutation {

    public void countPermutations(int[] nums, List<List<Integer>> ans, List<Integer> list) {
        if(list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
        }
        for(int num : nums) {
            if(list.contains(num)) {
                continue;
            }
            list.add(num);
            countPermutations(nums, ans, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        countPermutations(nums, ans, new ArrayList<>());
        return ans;
    }
}
