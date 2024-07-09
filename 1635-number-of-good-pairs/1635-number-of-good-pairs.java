class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums)
        {
            map.put(x , map.getOrDefault(x,0)+1) ;
        }

        int count = 0 ;
        for(int x : map.keySet())
        {
            int n = map.get(x) ;
            count += n*(n-1)/2 ;
        }
        return count ;
    }
}