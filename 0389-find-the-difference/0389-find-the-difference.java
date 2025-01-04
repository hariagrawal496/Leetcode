class Solution {
    public char findTheDifference(String s, String t) 
    {
    
       char[] arr_s = s.toCharArray() ;
       char[] arr_t = t.toCharArray() ;

       Arrays.sort(arr_s) ;
       Arrays.sort(arr_t) ;

       for(int i=0; i<arr_s.length; i++)
       {
           if(arr_t[i] != arr_s[i])
           {
            return arr_t[i] ;
           }
       }
        
        return arr_t[t.length()-1] ;
    }
}