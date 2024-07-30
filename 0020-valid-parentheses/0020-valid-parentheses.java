class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>() ;

          for(char c : s.toCharArray())
          {
              if(stack.isEmpty())
              {
                 stack.push(c) ;
                 continue ;
              }

              if(c == ')' || c == ']' || c == '}')
              {
                  if(c == '}' && stack.peek() == '{')
                  {
                    stack.pop() ;
                  }
                  else if(c == ')' && stack.peek() == '(')
                  {
                    stack.pop() ;
                  }
                  else if(c == ']' && stack.peek() == '[')
                  {
                    stack.pop() ;
                  }
                  else
                  {
                    return false ;
                  }
              }
              else
              {
                stack.push(c) ;
              }
          }

          if(stack.isEmpty())
          {
             return true ;
          }
          return false ;
    }
}