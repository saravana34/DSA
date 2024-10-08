class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /*boolean found = false;
        int []indexes = new int[2];
        for(int i=0; i < nums.length; i++) {
            if(!found) {
                indexes[0] = i;
                for(int j = i + 1; j < nums.length; j++){
                    if(target - nums[i] == nums[j]){
                        indexes[1] = j;
                        found = true;
                        break;
                    }
                } 
            }
        }
        return indexes;*/
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            int x = target - nums[i];
            if(map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
