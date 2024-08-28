class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    {
        Map<Integer,String> map = new TreeMap<>() ;

        for(int i=0; i<names.length; i++)
        {
            map.put(heights[i] , names[i]);
        }

        int i = names.length ;

        for(int x : map.keySet())
        {
            names[i-1] = map.get(x) ;
            i-- ;
        }
     return names; 
    }
}