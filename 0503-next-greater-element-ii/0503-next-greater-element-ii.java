class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n = nums.length ;
        int[] arr = new int[n] ;

        for(int i=0; i<nums.length; i++)
        {
            arr[i] = -1 ;

            for(int j= i+1 ; j<(i+n) ; j++)
            {
                if(nums[i] < nums[j%n])
                {
                   arr[i] = nums[j%n] ;
                   break ;
                }
            }
        }
   return arr ;
    }
}