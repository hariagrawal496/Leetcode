class Solution {
    public int findTargetSumWays(int[] nums, int target) 
    {
        int sum = 0 ;
        for(int x : nums)
        {
          sum += x ;
        }

        sum += target ;
        if(sum % 2 == 1 || sum < 0)
        {
            return 0 ;
        }

        sum = sum/2 ;

        return countNumberOfSubsetWithSumK(sum , nums) ;
    }

    public int countNumberOfSubsetWithSumK(int k , int[] nums)
    {
        int[][] dp = new int[nums.length + 1][k + 1] ;

        for(int i=0; i<=nums.length; i++)
        {
            for(int j=0; j<=k; j++)
            {
                if(i == 0  && j == 0)
                {
                    dp[i][j] = 1 ;
                    continue ;
                }

                if( i > 0)
                {
                    dp[i][j] += dp[i-1][j] ;

                    if( j-nums[i-1] >= 0)
                    {
                        dp[i][j] += dp[i-1][j-nums[i-1]] ;
                    }
                }
            }
        }
       return dp[nums.length][k] ;
    }
}