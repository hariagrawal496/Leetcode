class Solution {
    public int maxProduct(int[] nums) 
    {
        int maxProduct = Integer.MIN_VALUE ;
        int n = nums.length ;
        int leftprod = 1 ;
        int rightprod = 1 ;

        for(int i=0; i<n; i++)
        {
            leftprod *= nums[i] ;
            rightprod *= nums[n-1-i] ;

            maxProduct = Math.max(maxProduct , Math.max(leftprod, rightprod)) ;

            if(leftprod == 0)
            {
                leftprod = 1 ;
            }

            if(rightprod == 0)
            {
                rightprod = 1 ;
            }
        }
    return maxProduct ;
    }
}