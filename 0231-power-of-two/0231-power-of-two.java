class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        int temp = n ;
  
        while( temp != 0)
        {
              if( temp == 1)
              {
                return true ;
              }

             if( temp % 2 == 1)
             {
                return false ;
             }

           temp = temp/2 ;
        }
return false ;
    }
}