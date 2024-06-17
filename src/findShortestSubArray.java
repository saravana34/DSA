class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        Map<Integer,Integer> firstidx=new HashMap<>();
        Map<Integer,Integer> lastidx=new HashMap<>();

        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            freq.put(num,freq.getOrDefault(num,0)+1);
            if(!firstidx.containsKey(num)){
                firstidx.put(num,i);
            }
            lastidx.put(num,i);
            maxCount=Math.max(maxCount,freq.get(num));
        }
        int minlen=nums.length;
        for(int num:nums){
            if(freq.get(num)==maxCount){
                minlen=Math.min(minlen,lastidx.get(num)-firstidx.get(num)+1);
            }
        }
        return minlen;
    }
}
