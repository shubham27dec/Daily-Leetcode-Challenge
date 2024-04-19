import java.util.LinkedList;
import java.util.Queue;

public class April192024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numIslands(char[][] grid) {
            int ans = 0;
            int rows = grid.length;
            int cols = grid[0].length;
            boolean[][] visited = new boolean[rows][cols];
            for(int row=0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    if(!visited[row][col] && grid[row][col]=='1'){
                        bfs(grid,row,col,visited);
                        ans++;
                    }
                }
            }
            return ans;
        }

        void bfs(char[][] grid, int row, int col, boolean[][] visited){
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{row,col});
            visited[row][col] = true;
            while(!q.isEmpty()){
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
                if(r>0 && grid[r-1][c]=='1' && !visited[r-1][c]){
                    q.offer(new int[]{r-1,c});
                    visited[r-1][c] = true;
                }
                if(c>0 && grid[r][c-1]=='1' && !visited[r][c-1]){
                    q.offer(new int[]{r,c-1});
                    visited[r][c-1] = true;
                }
                if(r<grid.length-1 && grid[r+1][c]=='1' && !visited[r+1][c]){
                    q.offer(new int[]{r+1,c});
                    visited[r+1][c] = true;
                }
                if(c<grid[0].length-1 && grid[r][c+1]=='1' && !visited[r][c+1]){
                    q.offer(new int[]{r,c+1});
                    visited[r][c+1] = true;
                }
            }
        }
    }
}
