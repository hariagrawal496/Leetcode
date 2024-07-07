class Solution {
    public boolean isHappy(int n) 
    {
        int temp = n ;
        int sum = 0 ;

        while( temp != 0)
        {
            sum += (double)Math.pow( temp % 10 , 2) ;
             temp = temp/10 ;

             if( temp == 0)
             {
                 if( sum  < 10)
                 {
                    if( sum == 1 || sum == 7)
                    {
                        return true ;
                    }
                 }
                 else
                 {
                    temp = sum ;
                    sum = 0 ;
                 }
             }
        }
    return false ;
    }
}