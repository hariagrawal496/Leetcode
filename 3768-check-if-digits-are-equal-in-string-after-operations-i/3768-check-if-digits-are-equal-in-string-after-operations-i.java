class Solution {
    public boolean hasSameDigits(String s) 
    {
        int n = s.length() ;

        while(n > 0)
        {
             String ans = "" ;
             for(int i=1; i<n; i++)
             {
                int val = ( s.charAt(i) - '0' + s.charAt(i-1) - '0' ) % 10 ;
                 ans += val +"" ;
             }
          
            s = ans ;
            n-- ;

            if( n == 2  && s.charAt(0) == s.charAt(1))
            {
                return true ;
            }      
        }
 
     return false ;
    }
}