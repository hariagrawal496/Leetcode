class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        int[] arr = new int[2] ;
        int j=0 ;

        for(int x : nums)
        {
            int count = 0 ;
           for(int i=0; i<nums.length; i++)
           {
                if( x == nums[i])
                {
                    count++ ;
                }
           }

           if(count == 1)
           {
            arr[j++] = x ;
           }
        }
        return arr ;
    }
}