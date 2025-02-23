class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int s = 0 ;
        int e = nums.length-1 ;
        int lastElement = -1 ;

         while(s <= e)
         {
            int mid = s + (e-s)/2 ;

            if(nums[mid] == target)
            {
                lastElement = mid ;
            }

              if(nums[mid] > target)
              {
               e = mid - 1;  
              }
              else
              {
                s = mid + 1 ;
              }
         }

        s = 0 ;
        e = nums.length-1 ;
        int firstElement = -1 ;

        while(s <= e)
        {
            int mid = s + (e-s)/2 ;

            if(nums[mid] == target)
            {
                firstElement = mid ;
            }

              if(nums[mid] < target)
              {
                  s =  mid + 1 ;
              }
              else
              {
                  e = mid - 1 ; 
              }
        }

         return new int[]{firstElement, lastElement} ;
    }
}