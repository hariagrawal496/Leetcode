class Solution {
    public String reverseWords(String s) 
    {
         String[] arr = s.split(" ") ;
        String ans = "" ;
        String local = "" ;

        for(String str : arr)
        {
            local = "" ;
            for(char c : str.toCharArray())
            {
                if(c != ' ')
                {
                   local += c + "" ;
                }
            }

            if(local.length() > 0)
            {
                ans  = " " + local + ans ;
            }
            
        }
      return ans.trim() ;
    }
}