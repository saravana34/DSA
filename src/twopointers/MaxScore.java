class MaxScore {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int len = cardPoints.length;
        int low = 0;
        for(low = 0; low < k; low++) {
            sum += cardPoints[low];
        }
        int ans = sum;
        int high = len - 1;
        low--;
        while(low >= 0) {
            sum = sum - cardPoints[low]+ cardPoints[high];
            low--;
            high--;
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
