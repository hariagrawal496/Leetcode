class Solution {
    public String reverseWords(String s) 
    {
        String[] strs = s.split(" ") ;
        String ans = "" ;
        int start = 0 ;
        int end = 0;
        char c  ;
        

        for(String str : strs)
        {       
            System.out.println(str) ;
           char[] arr  = str.toCharArray() ;
            start = 0 ;
            end = str.length()-1 ;

             while(start <= end)
             {
                c  = arr[start] ;
                arr[start] = arr[end] ;
                arr[end] = c ;

                start++ ;
                end-- ;
             }



             if(str.length() > 0)
             {
                ans += new String(arr) + " " ;
             }  
        }
        return ans.trim() ;
    }
}