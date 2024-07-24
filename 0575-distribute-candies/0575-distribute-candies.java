class Solution {
    public int distributeCandies(int[] candyType) 
    {
        Set<Integer> set = new HashSet<>() ;
        for(int x : candyType)
        {
            set.add(x) ;
        }
        
        int n = candyType.length/2 ;
        int count = set.size() ;
  
        
            if(count <= n)
            {
              return count ;
            }    

         return n ;
    }
}