class NumberGame {
    public int[] numberGame(int[] nums) {
        /*if (nums == null || nums.length == 0) 
            return new int[]{};
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] res = new int[nums.length];
        for (int num : nums) {
            queue.add(num);
        }
        int idx = 0;
        while (!queue.isEmpty()) {
            int alice = queue.poll();
            if (queue.isEmpty()) break;
            res[idx++] = queue.poll();
            res[idx++] = alice;
        }
        return res;*/
        Arrays.sort(nums);
        int a=0, b=1;
        while(b<nums.length){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a=b+1;
            b=a+1;
        }
        return nums;
    }
}
