class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int n = nums.length ;
        int j = 1 ;
        int count = 1 ;
          
          for(int i=1; i<n; i++)
         {
             if(nums[i-1] == nums[i] )
             {
                 continue ;
             }
             else
             {
                 nums[j] = nums[i] ;
                 count++ ;
                 j++ ;
             }
         }
     
      return count ;
    }
}