class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {    
        List<Integer> list = new ArrayList<>() ;

        int col1 = 0 ;
        int row1 = 0 ;
        int col2 = matrix[0].length-1 ;
        int row2 = matrix.length-1 ;

        while(row1 <= row2  && col1 <= col2)
        {
            for(int j=col1; j<=col2 ; j++)
            {
                list.add(matrix[row1][j]) ;
            }
            row1++ ;
          
            for(int i=row1; i<=row2 ; i++)
            {
                list.add(matrix[i][col2]) ;
            }
            col2-- ;          

            if(row1 <= row2)
            {
                for(int j=col2; j>=col1; j--)
                {
                  list.add(matrix[row2][j]) ;
                }
            }
            row2-- ;

            if(col1 <= col2)
            {
                for(int i=row2; i>=row1; i--)
                {
                list.add(matrix[i][col1]) ;
                }
            }
            col1++ ;

        }
      return list ;
    }
}