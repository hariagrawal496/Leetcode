class Solution {
    public String longestPalindrome(String s) 
    {
        int n = s.length() ;
        String ans ="" ;

        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(checkPalindrome(i , j, s))
                {
                   if(j-i+1 >= ans.length())
                   {
                       ans = s.substring(i , j+1) ;
                   }
                }
            }
        }
        return ans ;
    }

    public static boolean checkPalindrome(int i, int j, String s)
    {
         while( i<=j)
         {
            if(s.charAt(i++) != s.charAt(j--))
            {
                return false ;
            }
         }
         return true ;
    }
}