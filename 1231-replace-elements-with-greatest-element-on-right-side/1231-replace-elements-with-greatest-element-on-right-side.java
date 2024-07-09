class Solution {
    public int[] replaceElements(int[] arr) 
    {
        int n = arr.length ;
        int[] arrData = new int[n] ;

        int maxValue = arr[n-1] ;
        arrData[n-1] = -1 ;
      
        for(int i=n-2; i>=0;i--)
        {
            arrData[i] = maxValue ;
            maxValue = Math.max(maxValue , arr[i]) ;
        }
        return arrData ;
    }
}