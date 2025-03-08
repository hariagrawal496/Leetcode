class Solution {
    public int findLucky(int[] nums) {
        
         Map<Integer,Integer> map = new HashMap<>() ;
         int maxNum = -1 ;
        
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x, 0)+1) ;
        }
        
        
        for(int x : map.keySet())
        {
            if(x == map.get(x))
            {
                maxNum = Math.max(maxNum, x) ;
            }
        }
        return maxNum ;
    }
}