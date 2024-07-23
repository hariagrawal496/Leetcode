class Solution {
    public int subsetXORSum(int[] nums) 
    {
        int sets = (int)Math.pow(2, nums.length) ;
        int val = sets ;
        int xor = 0 ;
        int sum = 0 ;

        while(sets-- > 0)
        {
             val = sets ;
             xor = 0 ;
             
             for(int i=0; i<nums.length; i++)
             {
                if(val % 2 == 1)
                {
                   xor ^= nums[i] ;
                }
                val = val/2 ;
             }
             sum += xor ;
        }
        return sum ;
    }
}