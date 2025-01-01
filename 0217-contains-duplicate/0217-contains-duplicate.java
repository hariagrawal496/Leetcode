class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>() ;

        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x, 0)+1) ;
        }

        for(int x : map.keySet())
        {
            if(map.get(x) > 1)
            {
                return true ;
            }
        }
    return false ;
    }
}