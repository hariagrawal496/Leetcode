class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int[] arr = new int[nums.length] ;

        for(int i=0; i<nums.length; i++)
        {
            arr[i] = Integer.MIN_VALUE ;
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[j] > nums[i])
                {
                   arr[i] = nums[j] ;
                   break ;
                }
            }

            if(arr[i] == Integer.MIN_VALUE )
            {
                for(int j=0; j<i; j++)
                {
                    if(nums[j] > nums[i])
                    {
                        arr[i] = nums[j] ;
                        break ;
                    }
                }
            }

             if(arr[i] == Integer.MIN_VALUE )
             {
                arr[i] = -1 ;
             }
        }
    return arr ;
    }
}