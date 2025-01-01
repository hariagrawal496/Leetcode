class Solution {
    public void sortColors(int[] nums) 
    {
        int s = 0 ;
        int e = nums.length-1 ;
        int i = 0 ;

        while(i <= e)
        {
            if(nums[i] == 0)
            {
                nums[i] = nums[s] ;
                nums[s] = 0 ;
                i++ ;
                s++ ;
            }
            else if(nums[i] == 1)
            {
                i++ ;
            }
            else
            {
                nums[i] = nums[e] ;
                nums[e] = 2 ;
                e-- ;
            }
        }      
    }
}