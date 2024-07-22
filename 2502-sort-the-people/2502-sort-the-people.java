class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    {
        Map<Integer, String> map = new TreeMap<>() ;
        int n = names.length ;

        for(int i=0; i<n; i++)
        {
            map.put(heights[i], names[i]) ;
           
        }

        int i=n-1 ;
        for(int x : map.keySet())
        {
            names[i--] = map.get(x) ;
        }
    return names ;
    }
}