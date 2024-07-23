class Solution {
    public int maxChunksToSorted(int[] arr) 
    {
        int count = 0 ;
        int maxValue = 0 ;

        for(int i=0; i<arr.length; i++)
        {
            maxValue = Math.max(maxValue , arr[i]) ;

            if(maxValue == i)
            {
                count++ ;
            }
        }
return count ;
    }
}