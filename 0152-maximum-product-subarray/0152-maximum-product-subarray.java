class Solution {
    public int maxProduct(int[] nums) 
    {    
        int prodFromFirst = 1 ;
        int prodFromLast  = 1 ;
        int maxProd = Integer.MIN_VALUE ;

        for(int i=0; i<nums.length; i++)
        {
            prodFromFirst *= nums[i] ;
            prodFromLast *= nums[nums.length-1-i] ;
        
            maxProd = Math.max(maxProd , Math.max(prodFromFirst, prodFromLast));

            if(prodFromLast == 0)
            {
                prodFromLast = 1 ;
            }

            if(prodFromFirst == 0)
            {
                prodFromFirst = 1 ;
            }
        }
        return maxProd ;
    }
}