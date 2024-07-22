class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    { 
        int maxValue = Arrays.stream(candies).max().orElse(0);
        
        List<Boolean> list = new ArrayList<>() ;

        for(int x : candies)
        {
             if(x+extraCandies >= maxValue)
             {
                list.add(true) ;
             }
             else
             {
                list.add(false) ;
             }
        }
        return list ;
    }
}