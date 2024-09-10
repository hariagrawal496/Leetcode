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

          int prod = 1 ;   
        for(int i=0; i<nums.length; i++)
        {
             prod *= nums[i] ;
             dp[i] = prod ;

             if(prod == 0)
             {
                prod = 1 ;
             }
        }

        int ans = Integer.MIN_VALUE ;
        prod = 1 ;

        for(int i=nums.length-1; i>=0; i--)
        {
             prod *= nums[i] ;
             dp[i] = Math.max(dp[i] ,prod) ;

             ans = Math.max(dp[i] , ans) ;

             if(prod == 0)
             {
                prod = 1 ;
             }
        }

        return ans ;
    }
}