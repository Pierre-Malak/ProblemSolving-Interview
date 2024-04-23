class Solution {
    public int maxProfit(int[] prices) {
    int minValue = prices[0];
    int profit = 0;
    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < minValue) {
            minValue = prices[i];
        } else {
              int currentProfit=prices[i]-minValue;
                profit=Math.max(currentProfit,profit);
        }
    }
    return profit;
    }
}