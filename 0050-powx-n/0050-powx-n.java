class Solution {
    public double myPow(double x, int n) 
    {
        if( x == 0)
        {
            return 0 ;
        }
        
        double ans = 1 ;

            if( n > 0)
            {
                while( n-- > 0)
                {
                    ans *= x;
                }
            }
            else
            {
                while( n++ < 0)
                {
                    ans /= x;
                }
            }

       

        return ans ;
    }
}