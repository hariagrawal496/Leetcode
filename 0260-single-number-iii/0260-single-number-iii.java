class Solution {
    public int[] singleNumber(int[] nums) 
    {
        Set<Integer> set = new HashSet<>() ;
        for(int x : nums)
        {
            if(set.contains(x))
            {
                set.remove(x) ;
            }
            else{
                set.add(x) ;
            }
        }

        int[] arr = new int[set.size()] ;
        int j=0 ;
         for(int x: set)
         {
            arr[j++] = x ;
         }
     return arr ;
    }
}