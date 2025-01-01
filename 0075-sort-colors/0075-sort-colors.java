class Solution {
    public void sortColors(int[] nums) 
    {
        HashMap<Integer ,Integer> map = new HashMap<>() ;
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x,0)+1) ;
        }

        int j=0; 

        for(int x : map.keySet())
        {
            int count = map.get(x) ;

            while(count-- != 0)
            {
                nums[j++] = x ;
            }
        }
    }
}