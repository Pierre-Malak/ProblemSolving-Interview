class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=0;i<prices.length-1;i++){
            int firstDay = prices[i];
            int lastDay = prices[i+1];
            if(firstDay<lastDay){
                int calcualtedProfit = this.profitCalculator(firstDay,lastDay);
                if(calcualtedProfit>0){
                    profit += calcualtedProfit;
                }
            }
        }
        return profit;
    }

    public int profitCalculator(int firstDay, int lastDay){
        return lastDay - firstDay;
    }
}