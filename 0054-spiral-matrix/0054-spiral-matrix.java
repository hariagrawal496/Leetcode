class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int m = matrix.length ;
        int n = matrix[0].length ;
        List<Integer> list = new ArrayList<>() ;

        int row1 = 0 ;
        int row2 = m ;

        int col1 = 0 ;
        int col2 = n ;

        while(row1 < row2 && col1 < col2)
        {
            if(row1 < row2 && col1 < col2)
            {
                for(int j=col1; j<col2 ; j++)
                {
                list.add(matrix[row1][j]) ;
                }
                row1++ ;             
            }           

            if(row1 < row2 && col1 < col2)
            {
                for(int i=row1; i<row2 ; i++)
                {
                list.add(matrix[i][col2-1]) ;
                }
                col2-- ;          
            }           

            if(row1 < row2 && col1 < col2)
            {
                for(int j=col2-1; j>=col1 ; j--)
                {
                list.add(matrix[row2-1][j]) ;
                }
                row2-- ;             
            }
            
            if(row1 < row2 && col1 < col2)
            {
                for(int i=row2-1; i>=row1 ; i--)
                {
                list.add(matrix[i][col1]) ;
                }
                col1++ ;            
            }
        }
        return list ; 
    }
}