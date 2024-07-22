class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxSum = Integer.MIN_VALUE  ;
        int sum = 0 ;

        int s = 0 ;
        int e = 0 ;

        while( s <= e && e <nums.length)
        {
            sum += nums[e++] ;
        maxSum = Math.max(maxSum , sum) ;

            while(sum < 0)
            {
                sum -= nums[s++] ;

                if(sum >= 0)
                {
                    break ;
                }
            }
        }
        return maxSum ;
    }
}