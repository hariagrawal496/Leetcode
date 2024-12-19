class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int k = 0 ;

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

             while(count > 0)
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