class Solution {
    public char findTheDifference(String s, String t) 
    {
        char val = 0 ;

       for(int i=0; i<s.length(); i++)
       {
           val ^= s.charAt(i) ^ t.charAt(i) ;
       }
        
        return  (char)(val ^ t.charAt(t.length()-1)) ;
    }
}