class Solution {
    public int pivotInteger(int n) 
    {   

        if( n == 1)
        {
            return 1 ;
        }

        int[] arr = new int[n] ;
        for(int i=0; i<n; i++)
        {
           if( i== 0)
           {
             arr[i] = i + 1 ;
           }
           else
           {
              arr[i] = arr[i-1] + i+1 ;
           }
        }
 
        int sum = 0 ;
        int lastsum = 0  ;
        for(int i=1; i<n; i++)
        {
            sum = arr[i-1] ;
            lastsum = arr[n-1] - arr[i] ;

            System.out.println(sum + " -> " + lastsum) ;

             if(sum == lastsum )
             {
                return i+1 ;
             }
        }
  return -1 ;
    }
}