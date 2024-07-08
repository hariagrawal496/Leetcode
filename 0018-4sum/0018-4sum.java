class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        Arrays.sort(nums) ;
        Set<List<Integer>> set = new HashSet<>() ;

        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1 ;j<nums.length;j++)
            {
                int s = j+1 ;
                int e = nums.length-1 ;

                while( s < e)
                {
                    long value = (long)nums[i] +  (long)nums[j] +  (long)nums[s] +  (long)nums[e] ;

                        if( value == target)
                        {
                            List<Integer> list = new ArrayList<>() ;
                            list.add(nums[i]) ;
                            list.add(nums[j]) ;
                            list.add(nums[s]) ;
                            list.add(nums[e]) ;

                            set.add(list) ;
                            s++ ;
                            e-- ;
                        }
                        else if(value > target)
                        {
                            e-- ;
                        }
                        else
                        {
                            s++ ;
                        }
                }
            }
        }
        return new ArrayList<>(set) ;
    }
}