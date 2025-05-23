public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
       int ans = 0 ;

       for(int i=0; i<32; i++)
       {
         ans <<= 1 ; // become 0.0

           if( (n & 1) == 1)
           {
               ans += 1 ;
           }
           n >>= 1 ;
       }
        
        return ans ;
    }
}