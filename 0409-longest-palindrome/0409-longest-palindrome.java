class Solution {
    public int longestPalindrome(String s) 
    {
        Map<Character, Integer> map = new HashMap<>() ;
           for(char c : s.toCharArray())
           {
            map.put(c , map.getOrDefault(c,0)+1) ;
           }

        int count = 0 ;
        boolean flag = true ;

        for(char c : map.keySet())
        {
            int value = map.get(c) ;

            if(value % 2 != 0 )
            {
                if( flag == true)
                {
                    flag = false ;
                    count += value ;
                }
                else
                {
                    count += value - 1 ;
                }
            }
            else{
                count += value ;
            }
        }
        return count ;
    }
}