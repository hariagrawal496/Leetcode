class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        Set<Integer> set = new TreeSet<>() ;
        for(int x : arr)
        {
            set.add(x) ;
        }

        int rank = 1;

        Map<Integer , Integer> map = new HashMap<>() ;

        for(int x : set)
        {
            if(!map.containsKey(x))
            {
                map.put(x , rank++) ;
            }      
        }

        for(int i=0;i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
               arr[i] = map.get(arr[i]) ;
            }
        }
        return arr ;
    }
}