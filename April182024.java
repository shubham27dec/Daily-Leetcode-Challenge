public class April182024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int rows = grid.length;
            int perimeter = 0;
            int cols = grid[0].length;
            for(int row=0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    if(grid[row][col]==1){
                        if(row==0 || grid[row-1][col]==0){
                            perimeter++;
                        }
                        if(row==rows-1 || grid[row+1][col]==0){
                            perimeter++;
                        }
                        if(col==0 || grid[row][col-1]==0){
                            perimeter++;
                        }
                        if(col==cols-1 || grid[row][col+1]==0){
                            perimeter++;
                        }
                    }
                }
            }
            return perimeter;
        }
    }
}
