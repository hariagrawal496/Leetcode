class Solution {
    public int reverse(int x) 
    {
        long value = x ;
        if(x < 0)
        {
            x = (-1) * x ;
        }

        String str = String.valueOf(x) ;
        int s = 0 ;
        int e = str.length()-1 ;
        char[] arr = str.toCharArray() ;

        while(s <= e && e < str.length())
        {
            char temp = arr[s] ;
            arr[s] = arr[e] ;
            arr[e] = temp ;

            s++ ;
            e-- ;
        }
        
           str = "" ;
          for(char c : arr)
          {
             if( c != '-')
             {
                str += c +"" ;
             }
          }
        long ans = Long.parseLong(str) ;

        if(value < 0)
        {
            ans *= -1 ;
        }

        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
        {
            return 0 ;
        }

        return (int)ans ;
    }
}