class Solution {
    public int findShortestSubArray(int[] nums) 
    {
        Map<Integer ,Integer> map = new HashMap<>() ;
        int maxFreq = 0 ;
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x, 0)+1) ;
            maxFreq = Math.max(maxFreq , map.get(x)) ;
        }
 
        map.clear() ;
        int minLength = Integer.MAX_VALUE ;
         Map<Integer ,Integer> indexMap = new HashMap<>() ;
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1) ;

            if(!(indexMap.containsKey(nums[i])))
           {
             indexMap.put(nums[i] , i) ;
           }

           if(map.get(nums[i]) == maxFreq)
           {
             minLength = Math.min(i - indexMap.get(nums[i]) +1  , minLength   );
           }         
        }
  return minLength ;
    }
}