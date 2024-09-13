class Solution {
    public int lengthOfLIS(int[] nums)
    {
        if(nums.length == 1 || nums.length == 0)
        {
            return nums.length ;
        }

        int[] dp = new int[nums.length] ;
        dp[0] = 1 ;
        int ans = 0 ;

        for(int i=1; i<nums.length; i++)
        {
            dp[i] = 1 ;
            for(int j=0; j<i ; j++)
            {
                if(nums[j] < nums[i])
                {
                    dp[i] = Math.max(dp[i] , dp[j] +1) ;
                }
            }
            ans = Math.max(dp[i] , ans) ;
        }
     return ans ;
    }
}