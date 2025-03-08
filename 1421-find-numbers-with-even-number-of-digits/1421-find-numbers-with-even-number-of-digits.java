class Solution {
    public int findNumbers(int[] nums) {

         int count = 0 ;
        
        for(int x : nums)
        {
            String str = String.valueOf(x) ;
            
            if(str.length() % 2 == 0)
            {
                count++ ;
            }
        }
        
        return count ;
        
    }
}