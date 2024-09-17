class Solution {
    public String longestPalindrome(String s) 
    {
        if(s.length() == 0 || s.length() == 1)
        {
            return s ;
        }

        String ans = "" ;
        
        for(int i=0; i<s.length(); i++)
        {
            String oddString  = checkValidString(s, i, i) ;
            String evenString = checkValidString(s, i-1, i) ;

            if(oddString.length() > ans.length())
            {
                ans = oddString ;
            }

            if(evenString.length() > ans.length())
            {
                ans = evenString ;
            }
        }

        return ans ;
    }

    public String checkValidString(String s,int start, int end)
    {
           while(start >= 0 && end < s.length())
           {
              if(s.charAt(start) == s.charAt(end))
              {
                   start-- ;
                   end++ ;
              }
              else
              {
                  break ;
              }
           }

           return s.substring(start+1, end) ;
    }
}