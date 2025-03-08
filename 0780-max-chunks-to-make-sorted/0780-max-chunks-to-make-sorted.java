class Solution {
    public int maxChunksToSorted(int[] arr) 
    {
        int n = arr.length ;
        int count = 0 ;
        int maxValue = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            maxValue = Math.max(maxValue, arr[i]) ;
            if(maxValue == i)
            {
                count++ ;
            }
        }
        return count ;
    }
}