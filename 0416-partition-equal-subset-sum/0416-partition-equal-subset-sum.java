class Solution {
    public boolean canPartition(int[] nums) 
    {
        if(nums.length == 1)
        {
            return false ;
        }

        int sum = 0 ;
        for(int x : nums)
        {
            sum += x ;
        }

        if(sum % 2 == 1)
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
        return subSetSum(sum , nums);
    }

    public static boolean subSetSum(int sum , int[] nums)
    {
         boolean[][] dp = new boolean[nums.length + 1][sum + 1] ;

         for(int i=0; i<=nums.length; i++)
         {
            for(int j=0; j<=sum ; j++)
            {
                if(i == 0 && j == 0)
                {
                    dp[i][j] = true;
                    continue ;
                }

                if( i > 0)
                {
                    if(dp[i-1][j] == true)
                    {
                        dp[i][j] = true ;
                    }
                    else if( j >= nums[i-1] && dp[i-1][j-nums[i-1]] == true ) 
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
         return dp[nums.length][sum] ;
    }
}