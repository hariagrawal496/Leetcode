class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n = nums.length ;
        int[] arr = new int[n] ;
        boolean flag = true ;

        for(int i=0; i<nums.length; i++)
        {
            arr[i] = -1 ;
            flag = true ;

            for(int j= i+1 ; j<n ; j++)
            {
                if(nums[i] < nums[j])
                {
                   arr[i] = nums[j] ;
                   flag = false ;
                   break ;
                }
            }

            if(flag)
            {
                for(int j=0 ; j<i ; j++)
                {
                    if(nums[i] < nums[j] )
                    {
                        arr[i] = nums[j] ;
                        break ;
                    }
                }
            }         
        }
   return arr ;
    }
}