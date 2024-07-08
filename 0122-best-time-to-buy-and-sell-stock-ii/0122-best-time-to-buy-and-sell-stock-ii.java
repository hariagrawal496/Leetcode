class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0 ;
        int buyPrice = prices[0] ;

        for(int x : prices)
        {
            if(x > buyPrice)
            {
                maxProfit += (x - buyPrice) ;
                buyPrice = x ;
                continue ;
            }
            buyPrice = Math.min(buyPrice,x) ;
        }
        return maxProfit ;
    }
}