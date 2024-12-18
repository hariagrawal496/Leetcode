class Solution {
    public int minAddToMakeValid(String s) 
    {

        int close = 0 ;
        int open = 0 ;

        for(char c : s.toCharArray())
        {
            if(c == ')')
            {
                if(close > 0)
                {
                    close-- ;
                }
                else
                {
                   open++ ;
                }
            }
            else
            {
                close++ ;
            }
        }
        
        return open + close ;
    }
}