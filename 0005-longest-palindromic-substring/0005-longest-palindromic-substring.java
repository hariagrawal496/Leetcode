class Solution {
    public String longestPalindrome(String s) 
    {
        // checking from center method
        String ans = "" ;

        for(int i=0; i<s.length(); i++)
        {
            String odd = expandFromCenter(s ,i ,i) ;
            String even = expandFromCenter(s ,i ,i+1) ;

            if (odd.length() > ans.length()) 
            {
                ans = odd;
            }

            if (even.length() > ans.length()) 
            {
                ans = even;
            }
        }
        return ans ;           
    }

    public static String expandFromCenter(String s , int left , int right)
    {
        String ans = "" ;

            while( left >= 0  && right <s.length()  && s.charAt(left) == s.charAt(right ))
            {       
                    if(right-left+1 >= ans.length())
                    {
                        ans = s.substring(left , right+1) ;
                    }   

                    left-- ;
                    right++ ;          
            }
    return ans ;
    }
}