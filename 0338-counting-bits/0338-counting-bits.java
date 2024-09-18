class Solution {
    public int[] countBits(int n) 
    {
        int[] arr = new int[n+1] ;

        for(int i=0; i<=n; i++)
        {
            int count = 0 ;  
            int value = i ;   
                  
            while(value > 0)
            {
                if((value & 1) == 1)
                {
                    count++ ;
                }
                value = value >> 1 ;
            }
            arr[i] = count ;
        }
        return arr ;
    }
}