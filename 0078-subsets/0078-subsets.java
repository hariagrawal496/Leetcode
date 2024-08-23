class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        int sets = (int)Math.pow(2, nums.length) ;
        List< List<Integer> > list = new ArrayList<>() ;

        while(sets > 0)
        {
            int val = sets-- ;
            List<Integer> data = new ArrayList<>() ;

            for(int i=0; i<nums.length; i++)
            {
                if(val % 2 == 1)
                {
                    data.add(nums[i]);
                }
                val = val/2 ;
            }
            list.add(data) ;
        }
        return list ;
    }
}