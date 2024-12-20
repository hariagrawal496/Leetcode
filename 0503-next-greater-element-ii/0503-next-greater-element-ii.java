class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        // 1 2 1 1 2 1 making the loop 2x

        Stack<Integer> stack = new Stack<>() ;
        int n = nums.length ;
        int[] arr = new int[n] ;

        for(int i=2*n-1 ; i>=0; i--)
        {
            arr[i%n] = -1 ;

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