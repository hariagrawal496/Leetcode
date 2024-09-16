class Solution {
    public int findTargetSumWays(int[] nums, int target) 
    {
        int sum = 0 ;
        for(int x : nums)
        {
            sum += x ;
        }
          sum = sum + target ;

          if(sum % 2 == 1 || sum < 0)
          {
            return 0 ;
          }

          int k = sum/2 ;
          return countSubsetWithSumK(nums, k) ;
    }

    public int countSubsetWithSumK(int[] arr, int k)
    {
        int[][] dp = new int[arr.length + 1][k + 1] ;

        for(int i=0; i<=arr.length; i++)
        {
            for(int j=0; j<=k; j++)
            {
                   if( i==0 && j==0)
                   {
                    dp[i][j] = 1 ;
                    continue ;
                   }

                   if(i > 0)
                   {
                       dp[i][j] += dp[i-1][j] ;

                       if(j-arr[i-1] >= 0)
                       {
                          dp[i][j] += dp[i-1][j-arr[i-1]] ;
                       }
                   }
            }
        }
        return dp[arr.length][k];
    }
}