class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String , List<String>> map = new HashMap<>() ;
        String local = "" ;

        for(String str : strs)
        {
            local = str ;
            char[] arr = local.toCharArray() ;
            Arrays.sort(arr) ;
            local = new String(arr) ;

            if(!map.containsKey(local))
            {
                map.put(local , new ArrayList<>()) ;
            }
            map.get(local).add(str) ;
        }

        List<List<String>> list = new ArrayList<>() ;
         for(String data : map.keySet())
         {
             list.add( map.get(data)) ;
         }
     return list ;
    }
}