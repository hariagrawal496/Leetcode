class Solution {
    public int maxProduct(int[] nums) 
    {
        int n = nums.length ;
        int maxProd = Integer.MIN_VALUE ;

        int prod1 = 1 ;
        int prod2 = 1 ;

        for(int i=0; i<n; i++)
        {
            prod1 *= nums[i];
            prod2 *= nums[n-1-i];

            maxProd = Math.max(maxProd, Math.max(prod1, prod2)) ;

            if(prod1 == 0)
            {
                prod1= 1 ;
            }

            if(prod2 == 0)
            {
                prod2 = 1 ;
            }
        }
    return maxProd ;
    }
}