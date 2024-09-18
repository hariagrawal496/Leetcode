class Solution {
    public int numDistinct(String s, String t) 
    {
        int m = s.length() ;
        int n = t.length() ;
        int[][] dp = new int[m+1][n+1] ;

        for(int i=0; i<=m; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if( j == 0)
                {
                    dp[i][j] = 1 ;
                    continue ;
                }

                if( i == 0)
                {
                    dp[i][j] = 0 ;
                    continue ;
                }

                dp[i][j] +=  dp[i-1][j] ;
                
                if(s.charAt(i-1) == t.charAt(j-1))
                {
                    dp[i][j] += dp[i-1][j-1] ;
                }
            }
        }
      return dp[m][n] ;
    }
}