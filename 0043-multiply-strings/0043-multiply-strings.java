class Solution {
    public String multiply(String num1, String num2) 
    {
        if( num1.charAt(0) == '0' || num2.charAt(0) == '0' )
        {
            return "0" ;
        }

        int n = num1.length() ;
        int m = num2.length() ;

        int[] arr = new int[m+n] ;

        for(int i=n-1 ; i>=0 ; i--)
        {
            for(int j=m-1 ; j>=0 ; j--)
            {
                 arr[i+j+1] += (num1.charAt(i)-'0') * (num2.charAt(j)-'0') ; 
                 arr[i+j] += arr[i+j+1]/10 ;
                 arr[i+j+1] =  arr[i+j+1]%10 ;
            }
        }

        String ans = "" ;
        boolean flag = true ;

         for(int x : arr)
         {
             if(x == 0 && flag == true)
             {
                continue ;
             }
             else
             {
                 ans += x +"" ;
                 flag = false ;
             }
         }
          
          return ans ;
        
    }
}