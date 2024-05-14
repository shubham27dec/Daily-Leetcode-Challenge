public class May142024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int getMaximumGold(int[][] grid) {
            int maxGold = 0;
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    if(grid[i][j]!=0 && !visited[i][j]){
                        maxGold = Math.max(dfs(i,j,grid,visited),maxGold);
                    }
                }
            }
            return maxGold;
        }

        int dfs( int row, int col, int[][] grid, boolean[][] visited){
            if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0 || visited[row][col]){
                return 0;
            }
            visited[row][col] = true;
            int top = dfs(row-1,col,grid,visited);
            int down = dfs(row+1,col,grid,visited);
            int left = dfs(row,col-1,grid,visited);
            int right = dfs(row,col+1,grid,visited);
            visited[row][col] = false;
            return Math.max(top , Math.max(down, Math.max(left, right))) + grid[row][col];
        }
    }
}
