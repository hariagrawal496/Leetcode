class Solution {
    public int countSubstrings(String s) 
    {
        if(s.length() == 0)
        {
            return 0 ;
        }

        if(s.length() == 1)
        {
            return 1 ;
        }

        int count = 0 ;

        for(int i=0; i<s.length(); i++)
        {
            count += checkPalindromeCount(s, i, i);
            count += checkPalindromeCount(s, i, i+1);
        }

        return count ;
    }

    public int checkPalindromeCount(String str , int s , int e)
    {
        int count = 0 ;
          while( s >= 0 && e < str.length())
          {
              if(str.charAt(s) == str.charAt(e))
              {
                count++ ;
                   s-- ;
                   e++ ;
              }
              else
              {
                break ;
              }
          }
          return count ;
    }
}