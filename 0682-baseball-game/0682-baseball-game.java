class Solution {
    public int calPoints(String[] operations) 
    {
       Stack<Integer> stack = new Stack<>() ;   
       int sum = 0 ;
 
       for(String x : operations)
       {
          if(x.equals("+"))
          {
              if(stack.size() < 2)
              {
                continue ;
              }
             int first = stack.pop() ;
             int second = stack.peek() ;
             stack.push(first) ;
             int val = first+second ;
             stack.push(val) ;
             sum +=  val ;
          }
          else if(x.equals("D"))
          {
              if(stack.size() < 1)
              {
                continue ;
              }
               int val = 2*stack.peek() ;
               stack.push(val) ;
               sum += val ;
          }
          else if(x.equals("C"))
          {
              if(stack.size() < 1)
              {
                continue ;
              }
            int val = stack.pop() ;
            sum -= val ;
          }
          else
          {
            int val = Integer.parseInt(x) ;
            stack.push(val) ;
            sum += val ;
          }
       }
  return sum ;
    }
}