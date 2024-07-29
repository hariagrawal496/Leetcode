class Solution {
    public String longestPalindrome(String s) 
    {
        String ans = "" ;
        for(int i=0; i<s.length() ; i++)
        {
            for(int j=i; j<s.length(); j++)
            {
                  if(reverseOfString(s , i, j))
                  {
                      if(j-i+1 >= ans.length())
                      {
                          ans = s.substring(i, j+1) ;
                      }
                  }
            }
        }  
        return ans ;
    }

    public static boolean reverseOfString(String str , int s, int e)
    {
          while(s <= e)
          {
             if(str.charAt(s++) != str.charAt(e--))
             {
                return false ;
             }
          }

     return true ;
    }
}