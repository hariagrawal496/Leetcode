class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int target = 0  ;
        Arrays.sort(nums) ;

        Set< List<Integer> > set = new HashSet<>() ;
        int n = nums.length ;

        for(int i=0; i<n; i++)
        {
             int s = i+1 ;
             int e = n-1 ;
             while( s < e)
             {
                int sum = nums[i] + nums[s] + nums[e] ;

                if( sum == target)
                {
                    List<Integer> data = new ArrayList<>() ;
                    data.add(nums[i]) ;
                    data.add(nums[s] ) ;
                    data.add(nums[e]) ;

                    set.add(data) ;

                    s++ ;
                    e-- ;
                }
                else if(sum > target)
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