public class August072023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row=0, col=matrix[row].length-1;
            while(col>=0 && row < matrix.length){
                if(matrix[row][col] > target) {
                    //row++;
                    col--;
                }
                else if(matrix[row][col] < target) {
                    row++;
                }
                else {
                    return true;
                }
            }
            return false;
        }
    }
}
