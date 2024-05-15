class FindNumbers {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            if(x>=10 && x<=99)
                ans++;
            else if(x>=1000 && x<=9999)
                ans++;
            else if(x==100000)
                ans++;
        }
        return ans;
    }
}
