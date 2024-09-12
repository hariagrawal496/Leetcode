class Solution {
    public String longestPalindrome(String s) 
    {
        int n = s.length() ;
        if(n == 0)
        {
            return "" ;
        }

        if(n == 1)
        {
            return s ;
        }

        String ans = "" ;
        for(int i=0; i<n; i++)
        {
            String oddString = checkpalindrome(i, i, s) ;
            String evenString = checkpalindrome(i, i+1, s) ;

            if(ans.length() < oddString.length())
            {
                 ans = oddString ;
            }

            if(ans.length() < evenString.length())
            {
                 ans = evenString ;
            }
        }
         return ans ;
    }

    public String checkpalindrome(int s, int e, String str)
    {
        while(s >= 0 && e < str.length())
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