class Solution {
    public int maxProfit(int[] prices) {
        // Code here
       /* int j=0,profit,maxprofit=0;
        int maxstock;
        for(int i=0;i<prices.length;i++)
        {
            maxstock=prices[i];
            for(j=i+1;j<prices.length;j++)
            {
                if(maxstock<prices[j])
                {
                    maxstock=prices[j];
                }
            }
            
            profit=maxstock-prices[i];
            if(maxprofit<profit)
            {
                maxprofit=profit;
            }
        }
        return maxprofit*/
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        
        return maxProfit;
    }
}

