class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int n = nums.length/3 ;
        Map<Integer,Integer> map = new HashMap<>() ;
        List<Integer> list = new ArrayList<>() ;

        for(int x :  nums)
        {
          map.put(x ,map.getOrDefault(x,0)+1) ;
          
           if(map.containsKey(x) && !list.contains(x) && map.get(x) > n)
            {
               list.add(x) ;
            }
        }
     return list ;
    }
}