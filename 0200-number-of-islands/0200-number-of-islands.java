class Solution {
    public int numIslands(char[][] grid) 
    {
         int count = 0 ;
         int m = grid.length ;
         int n = grid[0].length ;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j] == '1')
                {
                    count++ ;
                    dfs(i, j, count, grid) ;
                }       
            }
        }
      return count ;
    }

    public static void dfs(int i, int j, int count, char[][] grid)
    {
        grid[i][j] = '0' ;

        if(checkPoint(i-1 , j, grid))
        {
            dfs(i-1, j, count, grid) ;
        }

         if(checkPoint(i , j-1, grid))
        {
            dfs(i, j-1, count, grid) ;
        }

         if(checkPoint(i+1 , j, grid))
        {
            dfs(i+1, j, count, grid) ;
        }

         if(checkPoint(i , j+1, grid))
        {
            dfs(i, j+1, count, grid) ;
        }
    }

    public static boolean checkPoint(int i, int j, char[][] grid)
    {
         int m = grid.length ;
         int n = grid[0].length ;

         if(i >= 0 && i < m && j>=0 && j < n && grid[i][j] == '1')
         {
            return true ;
         }
     return false ;
    }
}