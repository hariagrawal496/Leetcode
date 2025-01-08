class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0 ;
        int buyPrice = prices[0] ;
        int n = prices.length ;
        
        for(int i=1; i<n; i++)
        {
            maxProfit = Math.max( maxProfit, (prices[i]-buyPrice) ) ;
            buyPrice = Math.min(buyPrice , prices[i]) ;
        }
        return maxProfit ; 
    }
}