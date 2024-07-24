class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
       int[] nums = new int[arr.length] ;
       for(int i=0; i<arr.length; i++)
       {
           nums[i] = arr[i] ;
       }
       Arrays.sort(nums) ; // 10 20 30 40

        int rank = 1;

        Map<Integer , Integer> map = new HashMap<>() ;

        for(int x : nums)
        {
            if(!map.containsKey(x))
            {
                map.put(x , rank++) ;
            }      
        }

        for(int i=0;i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
               arr[i] = map.get(arr[i]) ;
            }
        }
        return arr ;
    }
}