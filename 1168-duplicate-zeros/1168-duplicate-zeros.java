class Solution {
    public void duplicateZeros(int[] arr) 
    {
        for(int i=0; i<arr.length; i++)
        {
            if( arr[i] == 0)
            {
               arr = shiftArrayByOnePlaceToRight(arr , i) ;
              i++ ;

            }
        }
    }

    public static int[] shiftArrayByOnePlaceToRight(int[] arr , int x)
    {
       for(int i=arr.length-1; i>x; i--)
       {
           arr[i] = arr[i-1] ;
       }
       return arr ;
    }
}