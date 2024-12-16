class Solution {
    public int countPrimes(int n) 
    {
        int count = 0 ;
        boolean[] data = new boolean[n] ;

        for(int i=0; i<n; i++)
        {
            data[i] = true ;
        }

        for(int i=2; i<Math.sqrt(n) ; i++)
        {
            if(data[i] == true)
            {
                for(int j=i*i ;j<n; j=j+i)
                {
                    data[j] = false ;
                }
            }
        }

        for(int i=2; i<n; i++)
        {
            if(data[i] == true)
            {
                count++ ;
            }
        }
    return count ;
    }
}