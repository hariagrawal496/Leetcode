class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        Map<Character , Integer> map1 = new HashMap<>() ;
        Map<Character ,Integer> map2 = new HashMap<>() ;

        if(s.length() != t.length())
        {
            return false ;
        }

        for(int i=0; i<s.length() ; i++)
        {
            char s1 = s.charAt(i) ;
            char t1 = t.charAt(i) ;

            int indexS = map1.containsKey(s1) ? map1.get(s1) : -1  ;
            int indexT = map2.containsKey(t1) ? map2.get(t1) : -1  ;

            if(indexS != indexT)
            {
                return false ;
            }

            map1.put(s1, i) ;
            map2.put(t1, i) ;
   
        }
        return true; 
    }
}