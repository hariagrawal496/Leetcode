class Solution {
    public int distributeCandies(int[] candyType) 
    {
        Set<Integer> set = new HashSet<>() ;
        int count = 0 ;

        for(int x : candyType)
        {
            set.add(x) ;
        }
        int n = candyType.length/2 ;
  
        for(int x : set)
        {
            count++ ;
             if(count == n)
            {
                break ;
            }      
        }
         return count ;
    }
}