class Solution {
    public int reverse(int x) 
    {
        String str = String.valueOf(x) ;
        char[] arr = str.toCharArray() ;

        int s = 0 ;
        int e = str.length()-1 ;

        while( s <= e)
        {
            char ch = arr[s] ;
            arr[s] = arr[e] ;
            arr[e] = ch ;

            s++ ;
            e-- ;
        }

        String st = "" ;
         for(char c : arr)
         {
             if(c != '-')
             {
                st += c + "" ;
             }
         }
    
        long ans = Long.parseLong(st) ;
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE )
        {
            return 0 ;
        }

        if(x < 0)
        {
            return (int)(-1 * ans) ;
        }

     return (int)ans ;
    }
}