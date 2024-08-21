class Solution {
    public int numDecodings(String s) 
    {
      int n = s.length() ;
      int[] dp = new int[n+1] ;

      dp[0] = 1 ; // for empty
      dp[1] = s.charAt(0) == '0' ? 0 : 1 ; // only for 1 element

      // value  '' 1 1 1 0 6
      // index   0 1 2 3 4 5  

      for(int i=2; i<=n; i++) 
      {
        int oneDigit = Integer.parseInt(s.substring(i-1 , i)) ;
        int twoDigit = Integer.parseInt(s.substring(i-2 , i)) ;

        if(oneDigit > 0)
        {
          dp[i] = dp[i-1] ;
        }

        if(twoDigit > 9 && twoDigit < 27 )
        {
            dp[i] += dp[i-2] ;
        }
      }
    return dp[n] ;
    }
}