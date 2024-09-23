class Solution {
    public int lengthOfLIS(int[] nums) 
    {
         if(nums.length <= 1)
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
                if( nums[i] > nums[j])
                {
                    dp[i] = Math.max(dp[i], dp[j] + 1) ;
                }
            }
            ans = Math.max(ans, dp[i]) ;
         }

        return ans ;
    }
}