class Solution {
    public String reverseVowels(String s) 
    {
        if( s.length() < 2)
        {
            return s ;
        }

        char[] arr = s.toCharArray() ;
        
        int start = 0 ;
        int end = s.length()-1 ;

        while( start <= end)
        {
            if(!checkForVowel(arr[start]))
            {
               start++ ;
               continue ;
            }

            if(!checkForVowel(arr[end]))
            {
               end-- ;
               continue ;
            }

             char temp = arr[start] ;
             arr[start] = arr[end] ;
             arr[end] = temp ;

             start++ ;
             end-- ;
        }
        return new String(arr) ;
    }

    public static boolean checkForVowel(char c)
    {
         if( c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||
             c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U' )
            {
              return true ;
            }
        return false ;
    }
}