class Solution {
    public String longestPalindrome(String s) 
    {
        if(s.length() == 0 || s.length() == 1)
        {
            return s ;
        }

        String ans = "" ;

        for(int i=1; i<s.length() ; i++)
        {
            String odd = checkString(s, i , i) ;
            String even = checkString(s, i-1, i) ;

            if(ans.length() < odd.length())
            {
                ans = odd ;
            }

            if(ans.length() < even.length())
            {
                ans = even ;
            }
        }
     return ans ;
    }

    public String checkString(String str, int s, int e)
        {            
            while( s >= 0 && e < str.length())
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