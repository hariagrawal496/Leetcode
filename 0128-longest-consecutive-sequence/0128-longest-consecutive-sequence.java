class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>() ;      
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x, 0)+1) ;
        }

        int maxLength = 0 ;
        for(int x : map.keySet())
        {
            if(map.containsKey(x-1))
            {
                continue ;
            }
            else
            {
                int count=0 ;
                while(map.containsKey(x))
                {
                   count++ ;
                   x++ ;
                }
            maxLength = Math.max(maxLength , count) ;
            }
        }
        return maxLength ;
    }
}