class Solution {
    public boolean isMonotonic(int[] nums) 
    {
        if(nums.length == 1)
        {
            return true ;
        }

        int n = nums.length ;
        int positive = 0 ;
        int negative = 0 ;
    
        for(int i=1; i<n; i++)
        {
            if(nums[i] - nums[i-1] == 0)
            {
                positive++  ;
                negative++ ;
            }
            else if(nums[i] - nums[i-1] > 0)
            {
                positive++ ;
            }
            else
            {
                negative++ ;
            }
        }

        if(positive == n-1 || negative == n-1 )
        {
            return true ;
        }
    return false ;
    }
}

       