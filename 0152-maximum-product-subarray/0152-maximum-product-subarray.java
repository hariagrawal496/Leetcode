class Solution {
    public int maxProduct(int[] nums) 
    {
        int prod1 = 1 ;
        int prod2 = 1 ;
        int maxprod= Integer.MIN_VALUE ;

        for(int i=0; i<nums.length; i++)
        {
            prod1 *= nums[i] ;
            prod2 *= nums[nums.length-1-i] ;
            maxprod = Math.max(maxprod , Math.max(prod1 , prod2)) ;

            if(prod1 == 0)
            {
                prod1 = 1 ;
            }

            if(prod2 == 0)
            {
                prod2 = 1 ;
            }
        }
        return maxprod ;
    }
}