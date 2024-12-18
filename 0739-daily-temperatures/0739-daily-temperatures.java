class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int n = temperatures.length ;
        Stack<Integer> stack = new Stack<>() ;
        int[] arr = new int[n] ;

        for(int i=n-1; i>=0; i--)
        {
            while(!stack.isEmpty())
            {
                if(temperatures[stack.peek()] > temperatures[i])
                {
                    arr[i] = stack.peek()-i ;
                    break ;
                }

                stack.pop() ;
            }
            stack.push(i) ;
        }
    return arr ;
    }
}