class Solution {
    public int findKthLargest(int[] nums, int k) {
        
       Map<Integer , Integer> map = new TreeMap<>() ;
         
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x,0)+1) ;
        }

       int i=0 ;
       for(int x : map.keySet())
       {
        int val = map.get(x) ;
          while( val-- > 0)
          {
             nums[i++] = x ;
          } 
       }
     return nums[nums.length - k] ;
    }
}