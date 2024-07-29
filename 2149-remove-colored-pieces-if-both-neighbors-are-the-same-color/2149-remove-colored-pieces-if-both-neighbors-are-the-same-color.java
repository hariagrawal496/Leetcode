class Solution {
    public boolean winnerOfGame(String colors) 
    {
        if( colors.length() < 3 )
        {
            return false ;
        }


        int count_A = 0 ;
        int count_B = 0 ;

        for(int i=1; i<colors.length()-1 ; i++)
        {
            if(colors.charAt(i) == 'A')
            {
                if(colors.charAt(i-1) == 'A'  && colors.charAt(i+1) == 'A')
                {
                    count_A++ ;
                }
                
            }
           

            if(colors.charAt(i) == 'B')
            {
                if(colors.charAt(i-1) == 'B'  && colors.charAt(i+1) == 'B')
                {
                    count_B++ ;
                }
                
            }

           
        }

         if(count_A > count_B)
         {
           return true ;
         }

        return false ;
    }
}