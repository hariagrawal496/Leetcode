class Solution {
    public int maxDepth(String s) 
    {
        Stack<Character> stack = new Stack<>() ;

        int count = 0 ;
        int maxCount = 0 ;

        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                count++ ;
            }

            if(c == ')')
            {
              count-- ;
            }
            maxCount = Math.max(maxCount, count) ;
        }

     return maxCount ;
    }
}