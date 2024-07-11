class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int count = 0 ;
        int m = flowerbed.length ;

        for(int i=0; i<m; i++)
        {
            if(flowerbed[i] == 0)
            {
                int leftSide = (i == 0) ? 0 : flowerbed[i-1] ;
                int rightSide = (i == m-1) ?0 : flowerbed[i+1] ;

                if(leftSide == 0 && rightSide == 0 )
                {
                    count++ ;
                    flowerbed[i] = 1 ;
                }
            }
        }

         if(count++ >= n )
         {
            return true ;
         }
         return false ;
    }
}