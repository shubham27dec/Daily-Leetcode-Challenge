import java.util.ArrayList;
import java.util.List;

public class July192024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[] rowMin = new int[rows];
            int[] colMax = new int[cols];
            for(int row=0; row<rows; row++){
                int min = 100001;
                for(int col=0; col<cols; col++){
                    min = Math.min(min,matrix[row][col]);
                }
                rowMin[row] = min;
            }

            for(int col=0; col<cols; col++){
                int max = 0;
                for(int row=0; row<rows; row++){
                    max = Math.max(max,matrix[row][col]);
                }
                colMax[col] = max;
            }

            List<Integer> luckyNumbers = new ArrayList<>();

            for(int col=0; col<cols; col++){
                for(int row=0; row<rows; row++){
                    if(rowMin[row]==colMax[col]){
                        luckyNumbers.add(rowMin[row]);
                    }
                }
            }

            return luckyNumbers;

        }
    }
}
