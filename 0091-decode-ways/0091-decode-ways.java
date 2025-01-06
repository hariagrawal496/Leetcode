class Solution {
    public int numDecodings(String s) 
    {
        int n = s.length() ;
        int[] dp = new int[n+1] ;
        
        dp[0] = 1 ;
        dp[1] = (s.charAt(0) == '0') ? 0 : 1 ; // first digit
      
        for(int i=2; i<=n; i++)
        {
            String oneDigit = s.substring(i-1, i) ;
            String twoDigit = s.substring(i-2, i) ;

            int one = Integer.parseInt(oneDigit) ;
            int two = Integer.parseInt(twoDigit) ;

            if(one != 0)
            {
                dp[i]  = dp[i-1] ;
            }

            if(two > 9 && two <= 26)
            {
                dp[i]  += dp[i-2] ;
            }
        }
    return dp[n] ;
    }
}