class Solution {
    public String addBinary(String a, String b) 
    {
        int n = Math.max(a.length() , b.length()) ;
        int[] arr = new int[n+1] ;

        int sum = 0 ;

        for(int i=0; i<n; i++)
        {
            sum = 0  ;
            if(i < a.length())
            {
               sum = a.charAt(a.length()-1-i) - '0' ;
            }

            if( i < b.length())
            {
                sum += b.charAt(b.length()-1-i) - '0' ;
            }
            arr[n-i]  += sum ;
            arr[n-1-i] +=  arr[n-i] / 2 ;
            arr[n-i] =  arr[n-i]%2 ;
        }

        String ans  = "" ;
        boolean flag = true ;

        for(int i=0; i<arr.length; i++)
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