class PredictTheWinner {
    Integer memo[][];
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        if(n%2==0) return true; // Optimisation from MIT OCW
        memo=new Integer[n][n];
        return find(nums, 0, n-1)>=0;
    }
    private int find(int[] nums, int l, int r){
        if(l==r) return nums[l];
        if(memo[l][r]!=null) return memo[l][r];
        int ll=nums[l]-find(nums, l+1, r);
        int rr=nums[r]-find(nums, l, r-1);
        return memo[l][r]=Math.max(ll,rr);
    }
}
