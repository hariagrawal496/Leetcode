class Solution {
    public int maxChunksToSorted(int[] arr) 
    {
        int n = arr.length ;
        int count = 0 ;
        int maxVal = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            maxVal = Math.max(maxVal, arr[i]) ;
             if(maxVal == i)
             {
               count++ ;
             }
        }
        return count ;
    }
}