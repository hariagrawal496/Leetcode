class Solution {
    public int minDeletions(String s) 
    {
        Map<Character ,Integer> map = new HashMap<>() ;
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1) ;
        }

        Set<Integer> set = new HashSet<>() ;
        int count = 0 ;
        int value = 0 ;

       for(char c : map.keySet())
       {
            value = map.get(c) ;
            while(set.contains(value)) // 3 3 2
            {
                 count++ ;
                 value-- ;
            }

            if(value > 0)
            {
                set.add(value) ;
            }  
       }
       return count ;
    }
}