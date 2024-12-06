class Solution {
    public int lengthOfLongestSubstring(String str) 
    {
        int maxLength = 0 ;
		
		Set<Character> set = new HashSet<>() ;
		int s = 0 ;
		int e = 0 ;
		
		while(s <= e && e < str.length())
		{
			char c = str.charAt(e) ;
			
			if(set.contains(c))
			{
				while(set.contains(c))
				{
				  set.remove(str.charAt(s)) ;
				  s++ ;			  
				}			
			}
			
		 set.add(c) ;
		 maxLength = Math.max(maxLength, e-s+1) ;
		 
		 e++ ;
		}

    return maxLength;
    }
}