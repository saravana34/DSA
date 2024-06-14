class IsPossibleToSplit {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(int val : map.values()) {
            if(val > 2){
                return false;
            }
        }
        return true;
    }
}
