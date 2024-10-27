public class October272024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countSquares(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] dp = new int[rows][cols];
            int squares = 0;
            for(int row=0; row<rows; row++){
                dp[row][0] = matrix[row][0];
                squares += dp[row][0];
            }
            for(int col=1; col<cols; col++){
                dp[0][col] = matrix[0][col];
                squares += dp[0][col];
            }
            for(int row=1; row<rows; row++){
                for(int col=1; col<cols; col++){
                    if(matrix[row][col]==1){
                        dp[row][col] = Math.min(dp[row-1][col],Math.min(dp[row][col-1],dp[row-1][col-1]))+1;
                        squares += dp[row][col];
                    }
                }
            }
            return squares;
        }
    }
}
