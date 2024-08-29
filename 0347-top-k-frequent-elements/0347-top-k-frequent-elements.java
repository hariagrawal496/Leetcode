class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> map = new TreeMap<>() ;
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x, 0)+1) ;
        }

       List<Integer>[] arr_list = new List[nums.length + 1];

       for(int x : map.keySet())
       {
        int val = map.get(x) ;

          if(arr_list[val] == null )
          {
               arr_list[val] = new ArrayList<>() ;
          }
          arr_list[val].add(x) ;
       }

       int[] ans = new int[k] ;
       int count = 0 ;

        for (int i = arr_list.length - 1; i >= 0; i--) 
        {
            if (arr_list[i] != null) 
            {
                for (int j = 0; j < arr_list[i].size() && count < k; j++) 
                {
                    ans[count] = arr_list[i].get(j);
                    count++;
                }
            }
        }
        
      return ans ;
    }
}