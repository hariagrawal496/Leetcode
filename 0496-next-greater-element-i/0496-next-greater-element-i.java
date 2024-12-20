class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int n = nums2.length ;

        Stack<Integer> stack = new Stack<>() ;
        Map<Integer, Integer> map = new HashMap<>() ;

        for(int i=n-1; i>=0; i--)
        {
            map.put(nums2[i] , -1) ;
            while(!stack.isEmpty())
            {
                if(stack.peek() > nums2[i])
                {
                    map.put(nums2[i] , stack.peek()) ;
                    break ;
                }
                stack.pop() ;
            }
            stack.push(nums2[i]) ;
        }

        int[] arr = new int[nums1.length] ;

        for(int i=0; i<nums1.length; i++)
        {
          arr[i] = map.get(nums1[i]) ;
        }
    
    return arr ;
    }
}