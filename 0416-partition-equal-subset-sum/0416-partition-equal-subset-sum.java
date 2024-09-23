class Solution {
    public boolean canPartition(int[] nums) 
    {
        if(nums.length <= 1)
        {
            return false ;
        }

        int sum = 0 ;
        for(int x : nums)
        {
            sum += x ;
        }

        if(sum % 2 == 1 || sum < 0)
        {
            return false ;
        }

        sum = sum/2 ;
        for(int x : nums)
        {
            if(x > sum)
            {
                return false ;
            }
        }
        return checksubsetWithSumK(nums, sum) ;
    }

    public boolean checksubsetWithSumK(int[] nums, int k)
    {
        boolean[][] dp = new boolean[nums.length + 1][k + 1] ;

        for(int i=0; i<=nums.length; i++)
        {
            for(int j=0; j<=k ; j++)
            {
                if( i == 0 && j == 0)
                {
                    dp[i][j] = true ;
                    continue ;
                }

                if( i > 0)
                {
                    if(dp[i-1][j] == true)
                    {
                        dp[i][j] = true ;
                    }
                    else if((j - nums[i-1]) >= 0 && (dp[i-1][j - nums[i-1]]) == true)
                    {
                       dp[i][j] = true ;
                    }
                    else
                    {
                        dp[i][j] = false ;
                    }
                }
            }
        }
        return dp[nums.length][k] ;
    }
}