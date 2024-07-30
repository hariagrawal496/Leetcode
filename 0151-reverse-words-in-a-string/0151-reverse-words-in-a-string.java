class Solution {
    public String reverseWords(String s) 
    {
        String ans = "" ;
        String local = "" ;

            for(char c : s.toCharArray())
            {
                if(c != ' ')
                {
                   local += c + "" ;
                }
                else
                {
                    if(local.length() > 0)
                    {
                        ans  = " " + local + ans ;
                    }
                    local = "";
                }
            }
            ans  = " " + local + ans ;
      return ans.trim() ;
    }
}