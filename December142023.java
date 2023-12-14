public class December142023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[][] onesMinusZeros(int[][] grid) {
            int rows = grid.length, cols = grid[0].length;
            int[] onesRow = new int[rows];
            int[] onesCol = new int[cols];
            for(int row=0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    if(grid[row][col]==1){
                        onesRow[row]++;
                        onesCol[col]++;
                    }
                }
            }
            int[][] diff = new int[rows][cols];
            for(int row=0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    diff[row][col] = 2*onesRow[row] + 2* onesCol[col] -cols- rows;
                }
            }
            return diff;
        }
    }
}
