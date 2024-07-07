class Solution {
    public char findTheDifference(String s, String t) 
    {
         char c = 0 ;
         int length = Math.max(s.length() , t.length());

         for(int i=0; i<length ; i++)
         {
            if( i < s.length())
            {
                c ^= s.charAt(i) ;
            }

            if( i < t.length())
            {
                c ^= t.charAt(i) ;
            }
         }

      return c ; 
    }
}