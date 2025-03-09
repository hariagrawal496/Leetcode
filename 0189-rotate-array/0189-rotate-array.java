class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length ;
        k= k%n ;

        reverse(0, n-1, nums) ;
        reverse(0, k-1, nums) ;
        reverse(k, n-1, nums) ;
        
    }

    public void reverse(int s, int e, int[] arr)
    {
        while(s < e)
        {
            int temp = arr[s] ;
            arr[s] = arr[e] ;
            arr[e] = temp ;

            s++ ;
            e-- ;
        }
    }
}