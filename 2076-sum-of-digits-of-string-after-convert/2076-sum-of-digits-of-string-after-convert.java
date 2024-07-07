class Solution {
    public int getLucky(String s, int k) 
    {
        int totalSum = 0 ;
        for(char c : s.toCharArray())
        {
            int value = (int)c - 96 ; 
            value = value%10 + value/10 ;
            totalSum += value ;
        }
        
        k-- ;
        
        while( k > 0 )
        {
            int temp = totalSum ;
            totalSum = 0 ;
           
            while( temp > 0)
            {
                totalSum += temp%10 ;
                temp = temp/10 ;
            }
            k-- ;
        }
        return totalSum ;
    }
}