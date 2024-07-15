class Solution {
    public String multiply(String num1, String num2) 
    {
        if(num1.charAt(0) == '0' || num2.charAt(0) == '0')
        {
            return "0" ;
        }

        int m = num1.length() ;
        int n = num2.length() ;
        int[] arr = new int[m+n] ;
        
        for(int i=m-1; i>=0; i--)
        {
            for(int j=n-1 ; j>=0; j--)
            {
                arr[i+j+1] += (num1.charAt(i)-48) * (num2.charAt(j)-48)  ;
                arr[i+j]    +=  arr[i+j+1] / 10 ;
                System.out.println(arr[i+j] + " -> " + arr[i+j+1]) ;
                arr[i+j+1]  =  arr[i+j+1] % 10 ;
            }
        }

        String ans = "" ;
        boolean flag = true ;

        for(int i=0 ; i<arr.length ; i++)
        {
              if(arr[0] == 0 && flag == true)
              {
                flag = false ;
                continue ;
              }

            ans += arr[i] + "" ;
        }
        return ans ;
    }
}