class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m = matrix.length ;
        int n = matrix[0].length ;
        boolean flag = false ;

        int[] arr = new int[m*n] ;
        int x = 0 ;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[x++] = matrix[i][j] ;
                if(matrix[i][j] == target)
                {
                    flag = true ;
                }
            }
        }

         x = 0 ;
         Arrays.sort(arr) ;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                 matrix[i][j]  = arr[x++];
            }
        }      
    return flag ;
    }
}