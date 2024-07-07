class Solution {
    public int thirdMax(int[] nums) 
    {
        long first  = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third  = Long.MIN_VALUE;

        for(int x : nums)
        {
            if(first == x || second == x || third == x)
            {
                continue ;
            }
            
            if(x > first)
            {
                third = second ;
                second = first ;
                first = x ;
            }
            else if( x > second)
            {
                third = second ;
                second = x ;
            }
            else if( x > third)
            {
                third = x ;
            }
        }

        if( third == Long.MIN_VALUE || nums.length < 3)
        {
            third = first ;
        }
        
        return (int)third ;
    }
}