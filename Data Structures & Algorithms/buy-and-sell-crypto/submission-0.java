class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowestBuy = prices[0];

        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < lowestBuy) lowestBuy = prices[i];
            if(prices[i+1] - lowestBuy > max) max = (prices[i+1] - lowestBuy);
        }

        return max;
    }
}
