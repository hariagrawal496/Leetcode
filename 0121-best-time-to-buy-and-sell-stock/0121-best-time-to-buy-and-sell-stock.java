class Solution {
    public int maxProfit(int[] prices) 
    {
        int buyPrice = prices[0] ;
        int maxProfit = 0 ;

        for(int x : prices)
        {
            buyPrice = Math.min(buyPrice , x ) ;
            maxProfit = Math.max(maxProfit , (x - buyPrice)) ;
        }
        
    return maxProfit ;
    }
}