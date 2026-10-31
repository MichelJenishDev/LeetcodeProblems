class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit=0;
        int SumProfit =0;
        for(int i=1;i<prices.length;i++){
             if( profit > prices[i]-buy){
                 buy = prices[i];
                 SumProfit+= profit;
                 profit = 0;
             }
             //okay , so i have to add a small line of code for an edge case
             profit = Math.max(profit,prices[i]-buy);
        }
        if( profit > 0) SumProfit+= profit;
        return SumProfit;
    }
}