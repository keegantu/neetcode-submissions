class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowestBuy = prices[0];

        for(int i = 1; i<prices.length; i++){
            if(prices[i]-lowestBuy > max){
                max = prices[i]-lowestBuy;
            }
            if(prices[i]<lowestBuy){
                lowestBuy = prices[i];
            }

        }

        return max;
    }
}
