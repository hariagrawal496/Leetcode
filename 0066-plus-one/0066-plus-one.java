class Solution {
    public int[] plusOne(int[] digits) 
    {
        if(digits.length == 0)
        {
            return null ;
        }
        
        int n = digits.length;
        int[] arr = new int[n+1] ;
        int[] new_arr = new int[n] ;
        int value = 0 ;
      
        for(int i=n-1; i>=0; i--)
        {
           if( i == n-1)  
           {
             value = digits[i] + 1 ;  
           }
           else
           {
            value = digits[i]  ; 
           }

             arr[i+1]  += value  ; 
               arr[i]   = arr[i+1] / 10 ;
             arr[i+1]   = arr[i+1] % 10 ;   
           new_arr[i]   = arr[i+1] ;     
        }

        if(arr[0] == 0)
        {
            return new_arr ;
        }
      return arr ;
    }
}