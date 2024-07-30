class Solution {
    public String reverseWords(String s) 
    {
         String[] arr = s.split("\\s+") ;
        String ans = "" ;
        
        for(String str : arr)
        {
            ans = str + " " + ans ;
        }
      return ans.trim() ;
    }
}