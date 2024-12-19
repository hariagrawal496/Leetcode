class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int s = 0 ;
        int e = 0 ;
        int count = 0 ;
        int maxCount = 0 ;

        while(s <= e && e < nums.length)
        {
             if(nums[e] == 0)
             {
                count++ ;
             }

             while(count > k)
             {
                if(nums[s] == 0)
                {
                    count-- ;
                }
                s++ ;
             }
          
           maxCount = Math.max(maxCount , e-s+1) ;
           e++ ;
        }
    return maxCount ;
    }
}