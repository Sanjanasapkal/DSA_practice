class Solution {
    public int maxProfit(int[] prices) {
        // code here
        int maxprofit=0,profit,j;
        
        for(int i=0;i<prices.length;i++)
        {
            j=i+1;
            while(j<prices.length && prices[j-1]<prices[j])
            {
                j++;
            }
            profit=prices[j-1]-prices[i];
            maxprofit=maxprofit+profit;
            i=j-1;
        }
        return maxprofit;
    }
}