class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums) ;
        int target = 0 ;
        Set<List<Integer>> set = new HashSet<>() ;

        for(int i=0; i<nums.length; i++)
        {
            int s= i+1;
            int e = nums.length -1 ;

            while( s < e)
            {
                if( nums[i] + nums[s] + nums[e] == target)
                {
                    List<Integer> list = new ArrayList<>() ;
                     list.add(nums[i]) ;
                     list.add(nums[s]) ;
                     list.add(nums[e]) ;

                     set.add(list) ;

                     s++ ;
                     e-- ;
                }
                else if( nums[i] + nums[s] + nums[e] > target)
                {
                    e-- ;
                }
                else
                {
                    s++ ;
                }
            }
        }
         return new ArrayList<>(set) ;
    }
}