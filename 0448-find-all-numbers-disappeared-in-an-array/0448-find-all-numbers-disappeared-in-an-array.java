class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        Set<Integer> set = new HashSet<>() ;
            for(int x : nums)
            {
                set.add(x) ;
            }

            int j = 1 ;

            while( j <= nums.length)
            {
                if(set.contains(j))
                {
                    set.remove(j) ;
                }
                else
                {
                    set.add(j) ;
                }
                j++ ;
            }
     return new ArrayList<>(set) ;
    }
}