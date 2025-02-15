class Solution {
    public int addDigits(int num) 
    {
        int temp = num ;
        int sum = 0 ;

        while( temp != 0)
        {
            sum += temp%10 ;
            temp = temp/10 ;

            if(temp == 0)
            {
                if(sum < 10)
                {
                    break ;
                }

                temp = sum ;
                sum = 0 ;
            }
        }
    return sum ;
    }
}