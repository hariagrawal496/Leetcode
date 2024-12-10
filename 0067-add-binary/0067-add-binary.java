class Solution {
    public String addBinary(String a, String b) 
    {
       int maxLength = Math.max(a.length() , b.length()) ;
       int[] arr = new int[maxLength + 1] ;
       

        for(int i=0; i<maxLength ; i++)
        {
            int value = 0 ;

             if( i < a.length())
             {
                value += a.charAt(a.length()-1-i) - 48   ;
             }

             if(i < b.length())
             {
               value += b.charAt(b.length()-1-i) - 48   ;
             }

             arr[arr.length-1-i] += value ;
             arr[arr.length-1-i-1] += arr[arr.length-1-i]/2 ;
             arr[arr.length-1-i] = arr[arr.length-1-i]%2 ;
        }

        String ans = "" ;
        boolean flag = true ;
   
         for(int i=0; i<arr.length; i++)
         {
             if( arr[0] == 0 && flag== true)
             {
                flag = false ;
                 continue ;               
             }
             else
             {
                 ans += arr[i] + "" ;
             }
         }

         if(ans.length() == 0)
         {
            return "0" ;
         }
        return ans ;
    }
}