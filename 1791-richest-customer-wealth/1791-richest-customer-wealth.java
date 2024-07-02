class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int maxAmount = Integer.MIN_VALUE ;
        int value = 0 ;

        for(int i=0; i<accounts.length ; i++)
        {
            for(int j=0; j<accounts[i].length ; j++)
            {
                 value += accounts[i][j] ;
            }
            maxAmount = Math.max(maxAmount , value) ;
            value = 0 ;
        }
     return maxAmount ;
    }
}