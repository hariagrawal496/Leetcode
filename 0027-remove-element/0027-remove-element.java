class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int j=0 ;
         int count = 0 ;

        for(int x : nums)
        {
            if(val != x)
            {
                count++ ;
                nums[j++] = x ;
            }
        }

        while( j < nums.length)
        {         
            nums[j++] = 0 ;
        }

     return count ;
    }
}