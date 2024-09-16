class Solution {
    public int change(int amount, int[] coins) 
    {
        int[][] dp = new int[coins.length + 1][amount + 1] ;

        for(int i=0; i<=coins.length ; i++)
        {
            for(int j=0; j<=amount ; j++)
            {
                if( i == 0 && j == 0)
                {
                    dp[i][j] = 1 ;
                    continue ;
                }

                if( i > 0)
                {
                    dp[i][j] += dp[i-1][j] ;

                    if( j - coins[i-1] >= 0)
                    {
                        dp[i][j] += dp[i][j - coins[i-1]] ;
                    }
                }
            }
        }
        return dp[coins.length][amount];
    }
}