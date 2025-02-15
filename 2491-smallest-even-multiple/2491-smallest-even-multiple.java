class Solution {
    public int smallestEvenMultiple(int n) 
    {
        int temp = 2 * n ;
        int i = 1 ;

        while(i <= temp)
        {
            if( i % n == 0 && i % 2 == 0 )
            {
               break ;
            }
            i++ ;
        }
        return i ;
    }
}