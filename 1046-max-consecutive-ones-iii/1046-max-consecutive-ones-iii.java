class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int count_1 = 0 ;
        int count_0 = 0 ;
        int maxLength = 0 ;

        int s = 0 ;
        int e = 0 ;

        while( s <= e && e < nums.length)
        {
            if(nums[e] == 0)
            {
                count_0++ ;
            }

                while(count_0 > k)
                {
                    if(nums[s++] == 0)
                    {
                        count_0-- ;
                        break ;
                    }              
                }    
            maxLength = Math.max(maxLength , e-s+1) ;
            e++ ;
        }
      return maxLength ;
    }
}