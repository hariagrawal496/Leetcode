class Solution {
    public int heightChecker(int[] heights) 
    {
        int[] arr = Arrays.stream(heights).sorted().toArray() ;

        int count = 0 ;

        for(int i=0; i<heights.length; i++)
        {
            if(heights[i] != arr[i])
            {
               count++ ;
            }
        }
        return count ;
    }
}