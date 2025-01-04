class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        String[] strs = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+") ;
        
        Map<String, Integer> map = new HashMap<>() ;
        for(String str : strs)
        {
            map.put(str , map.getOrDefault(str, 0)+1) ;
        }
  
        for(String str : banned)
        {
           if(map.containsKey(str))
           {
             map.remove(str) ;
           }
        }

        int count = 0 ;
        String ans = "" ;

        for(String s : map.keySet())
        {
            if(map.get(s) > count)
            {
                count = map.get(s) ;
                ans = s ;
            }
        }

     return ans ;
    }
}