class Solution 
{
    public int maxAreaOfIsland(int[][] grid) 
    {
        int maxLength = 0 ;
        int m = grid.length ;
        int n = grid[0].length ;

        for(int i=0; i<m; i++)
        {
            int length  = 0 ;
            for(int j=0; j<n; j++)
            {
                if(grid[i][j] == 1)
                {
                    length = dfs(i, j, grid) ;
                    maxLength = Math.max(length, maxLength) ;
                }
            }
        }
     return maxLength ;
    }

    public static int dfs(int i, int j, int[][] grid )
    {     
        int length = 1 ;
        grid[i][j] = 0 ;

        if(checkPoint(i-1, j, grid))
        {
            length += dfs(i-1, j, grid)  ;          
        }

        if(checkPoint(i+1, j, grid))
        {
             length += dfs(i+1, j, grid);            
        }

        if(checkPoint(i, j-1, grid))
        {
            length += dfs(i, j-1, grid) ; 
        }

        if(checkPoint(i, j+1, grid))
        {
           length += dfs(i, j+1, grid) ;           
        }
        return length ;
    }


    public static boolean checkPoint(int i, int j, int[][] grid)
    {
        int m = grid.length ;
        int n = grid[0].length ;

        if(i>=0 && i<m && j>=0 && j<n && grid[i][j] == 1)
        {
            return true ;
        }
    return false ;
    }
}