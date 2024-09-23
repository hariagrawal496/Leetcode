class Solution {
    public String longestPalindrome(String s) 
    {
        if(s.length() == 0|| s.length() == 1)
        {
            return s ;
        }

        String ans = "" ;
        for(int i=0; i<s.length(); i++)
        {
            String oddString = checkPalindrome(s, i, i) ;
            String evenString = checkPalindrome(s, i, i+1) ;

            if(oddString.length() >  ans.length())
            {
                ans = oddString ;
            }

            if(evenString.length() >  ans.length())
            {
                ans = evenString ;
            }
        }
        return ans ;
    }

    public String checkPalindrome(String str, int s, int e)
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