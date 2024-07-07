class Solution {
    public int majorityElement(int[] nums) 
    {
        int count  = 0 ;
        int num = 0 ;

        for(int x :  nums)
        {
              if( count == 0)
              {
                 num = x ;
              }

              if(num == x)
              {
                 count++ ;
              }
              else
              {
                count-- ;
              }
        }
        return num ;
    }
}