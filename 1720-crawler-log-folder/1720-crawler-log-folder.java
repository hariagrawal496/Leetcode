class Solution {
    public int minOperations(String[] logs) 
    {
        int count = 0 ;
        Stack<String> stack = new Stack<>() ;
       
        for(String str : logs)
        {
            if(str.equals("./"))
            {
                continue ;
            }
            else if(str.equals("../"))
            {
                if(count == 0)
                {
                    continue ;
                }
                count-- ;
                stack.pop() ;
            }
            else
            {
                count++ ;
                stack.push(str) ;
            }
        }
     return count ;
    }
}