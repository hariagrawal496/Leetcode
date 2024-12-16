class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int n = nums.length ;
        int maxLength = 0 ;

        int s = 0 ;
        int e = 0 ;

        while(s <= e && e < n)
        {
            if(nums[e] == 0)
            {
                k-- ;
            }

            while(k < 0)
            {
                if(nums[s] == 0)
                {
                    k++ ;
                }
                 s++ ;

                if( k == 0)
                {
                    break ;
                }
                
            }

            maxLength = Math.max(maxLength , e-s+1) ;
            e++ ;
        }
    return maxLength ;
    }
}