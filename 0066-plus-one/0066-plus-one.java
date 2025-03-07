class Solution {
    public int[] plusOne(int[] digits) 
    {
         int n = digits.length ;
        int[] arr = new int[n+1] ;
    
        for(int i=n-1; i>=0; i--) // 99
        {
            if( i == n-1)
            {
                int val = digits[i] + 1 ;
                arr[i] = val / 10 ;
                arr[i+1] = val % 10 ;
            } 
            else
            {
                arr[i+1] += digits[i] ;
                arr[i] += arr[i+1] / 10 ;
                arr[i+1] = arr[i+1] % 10 ;

            }      
        }

        int[] arr1 = new int[n] ;

        if(arr[0] == 0)
        {
            for(int i=1; i<=n; i++)
            {
                arr1[i-1] = arr[i] ;
            }

            return arr1 ;
        }

       return arr ;
    }
}