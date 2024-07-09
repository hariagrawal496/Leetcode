class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
       Map<Integer, Integer> map = new HashMap<>() ;
       
       for(int x : nums)
       {
        map.put(x  , map.getOrDefault(x,0)+1) ;

         if(map.get(x) >= 2)
         {
            return true ;
         }
       }
       return false ;
    }
}