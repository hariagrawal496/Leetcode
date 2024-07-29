class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> set = new HashSet<>() ;  
        int maxLength = 0 ;
        int start = 0 ;
        int end = 0 ;

        while(start <= end && end < s.length())
        {
            if(set.contains(s.charAt(end)))
            {
                while(set.contains(s.charAt(end)))
                {
                    set.remove(s.charAt(start++));
                }
            }
            set.add(s.charAt(end++)) ;
         maxLength = Math.max(maxLength , end-start) ;
        } 
        return maxLength ;
    }
   
}