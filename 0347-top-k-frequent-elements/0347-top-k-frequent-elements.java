class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x, 0)+1) ;
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1 ] ;
        for(int x : map.keySet())
        {
            int val = map.get(x) ;
            if(bucket[val] == null)
            {
                bucket[val] =  new ArrayList<>() ;
            }
            bucket[val].add(x) ;
        }

        int[] ans = new int[k] ;
        int count = 0  ;

        for(int i=bucket.length-1; i>=0; i--)
        {
           if(bucket[i] != null)
           {
              for(int j=0; j<bucket[i].size() && count < k ; j++)
              {
                  ans[count++] = bucket[i].get(j) ;
              }
           }
        }
     return ans ;
    }
}