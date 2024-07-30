class Solution {
    public String longestPalindrome(String s) 
    {
        String ans = "" ;
        
        for(int i=0; i<s.length(); i++)
        {
            String even = checkedWithCenter(s, i, i) ;
            String odd =  checkedWithCenter(s, i, i+1) ;

            if(even.length() >= ans.length())
            {
                ans = even ;
            }

             if(odd.length() >= ans.length())
            {
                ans = odd ;
            }
        }
        return ans ;
    }

    public static String checkedWithCenter(String s , int left , int right)
    {
        String ans = "" ;
   
      while(left >=0 && right < s.length())
      {
          if(s.charAt(left) == s.charAt(right))
          {
              left-- ;
              right++ ;
          }
          else
          {
            break ;
          }
      }
     return s.substring(left+1 , right) ;
    }
}