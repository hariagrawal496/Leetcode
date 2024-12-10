class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] arr = new int[nums.length] ;
        int n = nums.length ;
        int prod = 1 ;

        for(int i=0; i<n; i++)
        {
            if( i != 0)
            {
              prod *= nums[i-1]  ;
            }

             arr[i] = prod ;
        }

            prod = 1 ;
        for(int i=n-1; i>=0; i--)
        {
            if( i != n-1)
            {
               prod *= nums[i+1] ;
            }

             arr[i] *= prod ;
        }

        return arr ;
    }
}