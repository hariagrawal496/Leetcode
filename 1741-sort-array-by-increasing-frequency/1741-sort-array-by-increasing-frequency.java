class Solution {
    public int[] frequencySort(int[] nums) 
    {
        Map<Integer, Integer> map = new TreeMap<>() ;     
        for(int i=nums.length-1 ; i>=0 ; i--)
        {
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1) ;
        }

         Map<Integer , List<Integer>> finalMap = new TreeMap<>() ;
        for(int x : map.keySet())
        {
            int val = map.get(x) ;

                if(!finalMap.containsKey(val))
                {
                    finalMap.put( val , new LinkedList<>()) ;
                }  

            finalMap.get(val).add(x) ;
        }

        int j = 0 ;

        for(int x : finalMap.keySet())
        {
            List<Integer> data = finalMap.get(x) ;
           
           for(int i=data.size()-1; i>=0; i--)
            {
                int count = x  ;
                int val = data.get(i) ;
                while(count-- > 0)
                {
                    nums[j++] = val;
                }
            }        
        }
        return nums ;
    }
} 