class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE ;
        int ans = 0 ;

        for(int i=0; i<nums.length; i++)
        {
            int s = i+1 ;
            int e = nums.length-1 ;
            while(s < e)
            {
                int value = nums[i] + nums[s] + nums[e] ;
                int diff = Math.abs(target - value) ;

                if(diff < minDiff)
                {
                    minDiff = diff ;
                     ans = value ;
                }

                if(value > target)
                {
                    e-- ;
                }
                else
                {
                    s++ ;
                }
            }
        }
    return ans ;
    }
}