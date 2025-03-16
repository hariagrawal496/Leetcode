class Solution {
    public int mostFrequentEven(int[] nums) {
          
        Map<Integer,Integer> map = new TreeMap<>() ;
        for(int x : nums)
        {
            if(x % 2 == 0)
              map.put(x, map.getOrDefault(x,0)+1) ;
        }
        
        int count = 0 ;
        int val = -1 ;
        
        for(int x : map.keySet())
        {
            if(map.get(x) > count)
            {
                count = map.get(x) ;
                val = x ;
            }
        }
        
        return val ;
        
    }
}