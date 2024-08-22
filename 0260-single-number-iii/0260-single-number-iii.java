class Solution {
    public int[] singleNumber(int[] nums) 
    {
        Set<Integer> set = new HashSet<>() ;
        int[] arr = new int[2] ;

        for(int x : nums)
        {
            if(set.contains(x))
            {
                set.remove(x) ;
            }
            else
            {
                set.add(x) ;
            }
        }

       int i=0 ;
        for(int x : set)
        {
            arr[i++] = x ;
        }

        return arr ;
    }
}