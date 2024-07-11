class Solution {
    public int singleNumber(int[] nums) 
    {
        Map<Integer , Integer> map = new HashMap<>() ;
        for(int x : nums)
        {
            map.put(x , map.getOrDefault(x, 0)+1) ;

            if(map.get(x) == 3)
            {
                map.remove(x) ;
            }   
        }
           for(int x : map.keySet())
           {
             return x ;
           }

        return 0;
    }
}