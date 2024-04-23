class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int minValue = prices[0];
        int maxValue = prices[0];
int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
                maxValue = prices[i]; 
            } else if (prices[i] > maxValue) {
                maxValue = prices[i];
            }
            profit = (maxValue - minValue) > profit ? maxValue - minValue : profit;
        }
        return profit;
    }
}