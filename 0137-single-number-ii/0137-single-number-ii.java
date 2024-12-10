class Solution {
    public int singleNumber(int[] nums) 
    {
        for(int i=0; i<nums.length; i++)
        {
            int value = nums[i] ;
            int count = 0 ;

            for(int j=0; j<nums.length ; j++)
            {
                if(value == nums[j])
                {
                    count++ ;
                }
            }

            if(count == 1)
            {
                return value ;
            }
        }
        return 0 ;
    }
}