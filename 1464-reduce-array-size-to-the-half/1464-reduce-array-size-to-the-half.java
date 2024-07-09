class Solution {
    public int minSetSize(int[] arr) 
    {
        Map<Integer,Integer> map = new HashMap<>() ;
           for(int x : arr)
           {
                map.put(x, map.getOrDefault(x,0)+1) ;
           }
        
        int[] freqCount = new int[map.size()] ;
        int j=0 ;
          for(int x : map.keySet())
          {
            freqCount[j++] = map.get(x) ;     
          }

        Arrays.sort(freqCount);

        int count = 0 ;
        int removeCount = 0 ;
        for(int i=freqCount.length-1; i>=0; i--)
        {
             removeCount += freqCount[i] ;
             count++ ;

             if(removeCount >= arr.length/2)
             {
                return count ;
             }
        }
     return 0 ;
    }
}