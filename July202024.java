public class July202024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
            int rows = rowSum.length;
            int cols = colSum.length;
            int[][] matrix = new int[rows][cols];
            int row=0;
            int col=0;
            while(row<rows && col<cols){
                if(rowSum[row]<=colSum[col]){
                    matrix[row][col] = rowSum[row];
                    colSum[col] -= rowSum[row++];
                }
                else{
                    matrix[row][col] = colSum[col];
                    rowSum[row] -= colSum[col++];
                }
            }
            return matrix;
        }
    }
}
