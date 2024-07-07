class Solution {
    public boolean isAnagram(String s, String t) 
    {
         if( s == t)
         {
            return true ;
         }

         if( s.length() != t.length())
         {
            return false ;
         }

        Map<Character,Integer> map = new HashMap<>() ;

        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

         for(char c : t.toCharArray())
         {
            if(map.containsKey(c))
            {
              map.put(c, map.get(c)-1) ;

              if( map.get(c) == 0)
              {
                map.remove(c) ;
              }      
            }
         }

         if(map.size() == 0)
         {
            return true ;
         }
   return false ;
    }
}