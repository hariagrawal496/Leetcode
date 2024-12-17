class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> list = new ArrayList<>() ;

        char[] arr = p.toCharArray() ;
        Arrays.sort(arr) ;
        p = new String(arr) ;

        for(int i=0; i<s.length()-p.length()+1 ; i++)
        {
            String ans = s.substring(i, i+p.length()) ;

            char[] arr1 = ans.toCharArray() ;
            Arrays.sort(arr1) ;
            ans = new String(arr1) ;

            if(ans.equals(p))
            {
                list.add(i) ;
            }        
        }
    return list ;
    }
}