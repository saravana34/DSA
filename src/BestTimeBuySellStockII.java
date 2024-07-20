class BestTimeBuySellStockII {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int profit = 0; 
        for(int i = 1; i < len; i++) {
            min = Math.min(min, prices[i]);
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - min;
                min = prices[i];
            }
        }
        return profit;
    }
}
