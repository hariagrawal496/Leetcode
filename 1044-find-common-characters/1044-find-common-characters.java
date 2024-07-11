class Solution {
    public List<String> commonChars(String[] words) 
    {
       Map<Character,Integer> map = new HashMap<>() ;
        for(char c : words[0].toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1) ;
        }

      for(int i=1; i<words.length; i++)
      {
           Map<Character,Integer> insideMap = new HashMap<>() ;
            for(char c : words[i].toCharArray())
            {
                insideMap.put(c,insideMap.getOrDefault(c,0)+1) ;
            }
        
            for(char ch : map.keySet())
            {
                if(insideMap.containsKey(ch))
                {
                    map.put( ch , Math.min( map.get(ch) , insideMap.get(ch) ) ) ;
                }
               else
               {
                map.put(ch , 0) ;
               }
            }
      }

      List<String> list = new ArrayList<>() ;

      for(char c: map.keySet())
      {
        int value = map.get(c) ;

          while(value-- > 0)
          {
              list.add(c + "") ;
          }
      }
       
       return list ;
    }
}