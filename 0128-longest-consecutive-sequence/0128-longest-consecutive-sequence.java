class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums == null)
        {
            return 0 ;
        }

        Set<Integer> set = new TreeSet<>() ;
        for(int x : nums)
        {
            set.add(x) ;
        }

        int maxLength = 0 ;
        
        for(int x : nums)
        {
            int count = 0 ;

            if(set.contains(++x))
            {
                continue ;
            }

            while(set.contains(--x))
            {          
                count++ ;
            }
            maxLength = Math.max(maxLength , count) ;
        }
        return maxLength ;
    }
}