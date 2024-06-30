class Solution {
    public int majorityElement(int[] nums) {
         int count = 0;
        int val = 0 ;

        for(int x : nums)
        {
            if( count == 0 )
            {
                val = x ;
            }

            if( val == x)
            {
                count++ ;
            }
            else
            {
                count-- ;
            }      
        }
        return val ;
    }
}