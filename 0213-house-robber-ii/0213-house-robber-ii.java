class Solution {
    public int rob(int[] nums) 
    {
        int n = nums.length ;

        if( n== 1)
            return nums[0] ;

        if( n== 2)
            return Math.max(nums[0], nums[1]) ;

        int[] firstArray = new int[n-1] ;
        int[] lastArray = new int[n-1] ;

       for(int i=0; i<n-1; i++)
       {
          firstArray[i] = nums[i+1] ;
          lastArray[i] = nums[i] ;
       }
     return Math.max(maxAmount(firstArray), maxAmount(lastArray));
    }

    public int maxAmount(int[] nums)
    {
        int n = nums.length ;

        if( n== 1)
            return nums[0] ;

        if( n== 2)
            return Math.max(nums[0], nums[1]) ;

        int[] dp = new int[n] ;
         dp[0] = nums[0] ;
         dp[1] = Math.max(nums[0], nums[1]);

         for(int i=2; i<n; i++)
         {
            dp[i] = Math.max(dp[i-1] , dp[i-2] + nums[i]) ;
         }

       return dp[n-1] ;
    }
}