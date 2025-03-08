class Solution {
    public int diagonalSum(int[][] mat) {
          int sum = 0 ;
        int n = mat.length ;
        
        for(int i=0; i<n; i++)
        {
            int s = i ;
            int e = n-1-i ;
            
            if(s == e)
            {
                sum += mat[i][e] ;
            }
            else
            {
                sum += mat[i][s] + mat[i][e] ;
            }
        }
        return sum ;
        
    }
}