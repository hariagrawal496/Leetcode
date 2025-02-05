class Solution {
    public int singleNumber(int[] nums) 
    {
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i=0; i<nums.length; i++)
        {
           map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1) ;
        }

        for(int x : map.keySet())
        {
            if(map.get(x) == 1)
            {
                return x ;
            }
        }
        return 0 ;
    }
}