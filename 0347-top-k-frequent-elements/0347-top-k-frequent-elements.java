class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x, 0)+1) ;
        }

        Map< Integer, List<Integer> > insideMap = new TreeMap<>((a,b) -> b-a) ;
        for(int x : map.keySet())
        {
             int val = map.get(x) ;    
             if(!insideMap.containsKey(val))
             {
                insideMap.put(val, new ArrayList<>()) ;
             }

             insideMap.get(val).add(x) ;
        }

        int[] arr = new int[k] ;
        int j = 0 ;

        for(int x : insideMap.keySet() )
        {
           List<Integer> list = insideMap.get(x) ;

           System.out.println(x + " -> " + list) ;

           for(int i=0; i<list.size() ; i++)
           {
                if( j < k)
                {
                    arr[j++] = list.get(i) ;
                }          
           }      
        }
       return arr ;
    }
}