class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0 ;
        int buyPrice = Integer.MAX_VALUE ;

        for(int x : prices)
        {
           buyPrice  = Math.min(x, buyPrice) ;

           if( buyPrice < x)
           {
              maxProfit += x - buyPrice ;
              buyPrice = x ;
           }
      
        }
    return maxProfit ;
    }
}