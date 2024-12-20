class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n = nums.length ;
        int[] arr = new int[2 * n] ;

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = nums[i%n] ;
        }

        Stack<Integer> stack = new Stack<>() ;
        int[] ans = new int[arr.length] ;

        for(int i=2*n-1; i>=0 ; i--)
        {
            ans[i] = -1 ;
            while(!stack.isEmpty())
            {
                if(stack.peek() > arr[i])
                {
                    ans[i] = stack.peek() ;
                    break ;
                }
                stack.pop() ;
            }
            stack.push(arr[i]) ;
        }

        for(int i=0; i<n; i++)
        {
            nums[i] = ans[i] ;
        }
        return nums ;
    }
}