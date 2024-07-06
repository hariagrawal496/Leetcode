class Solution {
    public boolean isPalindrome(int x) 
    {
      int temp = x ;
      int value = 0 ;

      while(x > 0)
      {
         value = value * 10 + x%10 ;
         x = x/10 ;
      }

      if( temp == value)
      {
          return true  ;
      }
       return false ; 
    }
}