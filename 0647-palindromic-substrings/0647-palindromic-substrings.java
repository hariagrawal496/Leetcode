class Solution {
    public int countSubstrings(String s) 
    {
        int n = s.length() ;
        if(n == 0)
        {
            return 0 ;
        }

        if(n == 1)
        {
            return 1 ;
        }

        int count = 0 ;
        for(int i=0; i<n; i++)
        {
            count += checkpalindrome(i, i, s) ;
            count += checkpalindrome(i, i+1, s) ;   
        }
         return count ;
    }

    public int checkpalindrome(int s, int e, String str)
    {
        int count = 0 ;
        while(s >= 0 && e < str.length())
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