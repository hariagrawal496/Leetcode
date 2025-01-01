class Solution {
    public void sortColors(int[] nums) 
    {
        int count_0 = 0 ;
        int count_1 = 0 ;
        int count_2 = 0 ;

        for(int x : nums)
        {
            if(x == 1)
            {
                count_1++ ;
            }
            else if( x == 0)
            {
                count_0++ ;
            }
            else
            {
                count_2++ ;
            }
        }

        int i=0; 
        while(count_0-- != 0)
        {
            nums[i++] = 0 ;
        }

        while(count_1-- != 0)
        {
            nums[i++] = 1 ;
        }

        while(count_2-- != 0)
        {
            nums[i++] = 2 ;
        }

    }
}