class Solution {
    public int[] sortArrayByParityII(int[] nums) 
    {
        int i = 0; 
        int j = 1 ;
        int n  = nums.length ;

       int[] arr = new int[n] ;

       for(int x : nums)
       {
           if(x % 2 == 0)
           {
             arr[i] = x ;
             i = i+2 ;
           }
           else
           {
            arr[j] = x ;
            j = j+2 ;
           }
       }
     return arr ;
    }
}