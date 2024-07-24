class Solution {
    public boolean checkStraightLine(int[][] coordinates) 
    {
        double slope = 0 ;
        double insideSlope = 0 ;

        int x1 = coordinates[0][0] ;
        int y1 = coordinates[0][1] ;
        int x2 = coordinates[1][0] ;
        int y2 = coordinates[1][1] ;
        int val = x2-x1 ;

           if(val == 0)
           {
              slope = Double.MAX_VALUE ;
           }
           else
           {
              slope = (double)(y2-y1)/(double)(x2-x1) ;
           }


           for(int i=1; i<coordinates.length-1 ; i++)
           {
                    insideSlope = 0 ;
                    val = 0 ;

                    x1 = coordinates[i][0] ;
                    y1 = coordinates[i][1] ;
                    x2 = coordinates[i+1][0] ;
                    y2 = coordinates[i+1][1] ;
                   
                    val = x2-x1 ;

                    if(val == 0)
                    {
                        insideSlope = Double.MAX_VALUE ;
                    }
                    else
                    {
                        insideSlope = (double)(y2-y1)/(double)(x2-x1) ;
                    }
                    
                    if(insideSlope != slope)
                    {
                        return false ;
                    }     
           } 
     return true ;
    }
}