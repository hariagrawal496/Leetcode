class Solution {
    public String longestPalindrome(String s) 
    {
        if(s.length() == 0)
        {
            return "" ;
        }

        if(s.length() == 1)
        {
            return s ;
        }

        String ans = "" ;
        for(int i=0; i<s.length(); i++)
        {
           String oddLength  =  checkForLength(i, i, s);
           String evenLength =  checkForLength(i, i+1, s);

           if(oddLength.length() > ans.length())
           {
               ans = oddLength ;
           }

           if(evenLength.length() > ans.length())
           {
               ans = evenLength ;
           }
        }
         return ans ;
    }

        public String checkForLength(int s , int e , String str)
        {
             while( s >=0 && e <str.length())
             {
                  if(str.charAt(s) == str.charAt(e))
                  {
                       s-- ;
                       e++ ;
                  }
                  else
                  {
                    break ;
                  }
             }

             return str.substring(s+1, e) ;
        }
}