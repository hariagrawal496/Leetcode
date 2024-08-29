class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String , List<String>> map = new HashMap<>() ;

        for(String str : strs)
        {
           char[] arr = str.toCharArray() ;
           Arrays.sort(arr) ;

           String data = new String(arr) ;

           if(!map.containsKey(data))
           {
               map.put(data , new ArrayList<>()) ;
           }
            map.get(data).add(str) ;    
        }

    List<List<String>> list = new ArrayList<>() ;
        for(String data : map.keySet())
        {
            list.add(map.get(data)) ;
        }
  return list ;
    }
} 