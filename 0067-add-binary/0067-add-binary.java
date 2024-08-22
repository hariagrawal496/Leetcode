class Solution {
    public String addBinary(String a, String b) 
    {
        int len = Math.max(a.length() , b.length()) ;
        int[] arr = new int[len+1] ;

        for(int i=0; i<len ; i++)
        {
            int sum = 0 ;
            if( i < a.length())
            {
              sum += a.charAt(a.length()-1 - i) - '0' ;
            }

            if( i < b.length())
            {
              sum += b.charAt(b.length()-1 - i) - '0' ;
            }

            arr[len-i] += sum ;
            arr[len-1-i] += arr[len-i]/2 ;
            arr[len-i] = arr[len-i]%2 ;
        }

        String ans = "" ;
        boolean flag = true ;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[0] == 0 &&flag == true)
            {
                flag = false ;
                continue ;
            }
            else
            {
                ans += arr[i] + "" ;
            }
        }
        System.out.println(ans) ;

        if(ans == "")
        {
            return "0" ;
        }

     return ans ;
    }
}