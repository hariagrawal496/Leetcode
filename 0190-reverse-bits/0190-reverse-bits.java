public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
        int ans =  0 ;
        int count = 0 ;

        while( count < 32)
        {
             ans <<= 1  ;

           if((n&1) == 1)
           {
             ans += 1 ;
           }
           
           n >>= 1 ;

           count++ ;
        }
        
        return ans ;
    }
}