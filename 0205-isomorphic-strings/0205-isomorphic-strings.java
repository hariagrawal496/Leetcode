class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
         if(s.length() != t.length())
         {
            return false ;
         }

         if(s == t)
         {
            return true ;
         }

        Map<Character, Integer> map_s = new HashMap<>() ;
        Map<Character, Integer> map_t = new HashMap<>() ;

        for(int i=0; i<s.length() ; i++)
        {
            int sData = map_s.containsKey(s.charAt(i)) ? map_s.get(s.charAt(i)) : -1 ;
            int tData = map_t.containsKey(t.charAt(i)) ? map_t.get(t.charAt(i)) : -1 ;

            if(sData != tData)
            {
                return false ;
            }

            map_s.put(s.charAt(i), i) ;
            map_t.put(t.charAt(i), i) ;
        }
      return true ;
    }
}