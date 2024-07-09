class Solution {
    public int romanToInt(String s) 
    {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I' , 1) ;
        map.put('V' , 5) ;
        map.put('X' , 10) ;
        map.put('L' , 50) ;
        map.put('C' , 100) ;
        map.put('D' , 500) ;
        map.put('M' , 1000) ;

        int n = s.length() ;
        int ans = map.get(s.charAt(n-1)) ;
        int prev =0 ;
        int curr = 0 ;
    
        for(int i=1; i<n ; i++) 
        {
            prev = map.get(s.charAt(i-1)) ;
            curr = map.get(s.charAt(i)) ;

           if(prev < curr)
           {
             ans -= prev ;
           }
           else
           {
              ans += prev ;
           }
        }
        return Math.abs(ans) ;
    }
}