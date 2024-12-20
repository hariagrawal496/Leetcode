class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n = nums.length ;
        int[] arr = new int[n] ;

        for(int i=0; i<n; i++)
        {
           arr[i] = -1 ;
        }

        Stack<Integer> stack = new Stack<>() ;

        for(int i=2*n-1; i>=0 ; i--)
        {
            while(!stack.isEmpty())
            {
                if(stack.peek() > nums[i%n])
                {
                    arr[i%n] = stack.peek() ;
                    break ;
                }
                stack.pop() ;
            }
            stack.push(nums[i%n]) ;
        }
        return arr ;
    }
}