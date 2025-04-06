class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        Set<Integer> set = new HashSet<>() ;
        int n = nums.length ;

        for(int x : nums)
        {
            set.add(x) ;
        } 

        for(int i=1; i<=n; i++)
        {
            if(!set.contains(i))
              return i ;
        }
    return n+1  ;
    }
}