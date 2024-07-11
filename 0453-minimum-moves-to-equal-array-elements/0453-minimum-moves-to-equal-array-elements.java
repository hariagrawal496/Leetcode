class Solution {
    public int minMoves(int[] nums) 
    {
        int minValue = Integer.MAX_VALUE ;
        for(int x : nums)
        {
             minValue = Math.min(minValue , x) ;
        }

        int move = 0 ;
        for(int x : nums)
        {
            move += Math.abs(x - minValue) ;
        }
        return move ;
    }
}