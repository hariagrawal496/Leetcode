class Solution {
    public int minAddToMakeValid(String s) 
    {
        if(s.length() == 0 || s.length() == 1)
        {
            return s.length() ;
        }

        Stack<Character> stack = new Stack<>() ;
        for(char c : s.toCharArray())
        {
            if(stack.isEmpty())
            {
                stack.push(c) ;
                continue ;
            }

            if(c == ')' && stack.peek() == '(')
            {
                stack.pop() ;
            }
            else
            {
                stack.push(c) ;
            }
        }
        return stack.size() ;
    }
}