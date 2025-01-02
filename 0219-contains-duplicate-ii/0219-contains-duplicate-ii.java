class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        //bruteforce approach
        int n = nums.length ;
        Map<Integer ,Integer> map = new HashMap<>() ;

        for(int i=0; i<n; i++)
        {
            if(map.containsKey(nums[i]))
            {
                int index = map.get(nums[i]) ;

                if((i-index) <= k)
                {
                    return true ;
                }
            }
           map.put(nums[i] , i) ;
        }
        return false ;
    }
}