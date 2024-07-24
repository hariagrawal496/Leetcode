class Solution {
    public int heightChecker(int[] heights) 
    {
        Map<Integer , Integer> map = new TreeMap<>() ;

        for(int x : heights)
        {
            map.put(x, map.getOrDefault(x,0)+1) ;
        }

        int[] arr = new int[heights.length] ;
        int i=0 ;

        for(int x : map.keySet())
        {
            int count = map.get(x) ;
            while(count-- > 0)
            {
                arr[i++] = x ;
            }
        }

        int ans = 0 ;
        for(int j=0; j<heights.length; j++ )
        {
            if(heights[j] != arr[j])
            {
               ans++ ;
            }
        }
        return ans;
    }
}