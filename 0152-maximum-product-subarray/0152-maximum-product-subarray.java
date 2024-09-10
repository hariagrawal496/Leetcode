class Solution {
    public int maxProduct(int[] nums) 
    {
        if(nums.length == 0)
        {
            return 0 ;
        }

        if(nums.length == 1)
        {
            return nums[0] ;
        }

        int[] dp = new int[nums.length] ;  
        int leftprod = 1 ;  
        int rightprod = 1 ;  
    
        for(int i=0; i<nums.length; i++)
        {
            dp[i] = Integer.MIN_VALUE;

            leftprod *= nums[i] ;
            dp[i] = Math.max(dp[i], leftprod);

            rightprod *= nums[nums.length-1-i] ;
            dp[i] = Math.max(dp[i], rightprod);


            if(leftprod == 0)
            {
                leftprod = 1 ;
            }

            if(rightprod == 0)
            {
                rightprod = 1 ;
            }
        }
    
        int ans = Integer.MIN_VALUE ;
        for(int i=nums.length-1; i>=0; i--)
        {
           ans = Math.max(ans, dp[i] ) ;
        }

        return ans ;
    }
}