class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxSum = Integer.MIN_VALUE  ;
        int sum = 0 ;
        int e = 0 ;

        while( e < nums.length)
        {
            sum += nums[e++] ;
          maxSum = Math.max(maxSum , sum) ;

          if( sum < 0)
          {
            sum = 0 ;
          }

        }
        return maxSum ;
    }
}