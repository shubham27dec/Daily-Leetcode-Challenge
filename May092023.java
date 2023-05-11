import java.util.ArrayList;
import java.util.List;

public class May092023 {

    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int startRow =0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol =  matrix[0].length-1;

        while(startRow<=endRow && startCol <= endCol){
            //right to left
            for(int j=startCol; j<=endCol; j++){
                res.add(matrix[startRow][j]);
            }
            // top to bottom
            for(int i=startRow+1; i<=endRow; i++){
                res.add(matrix[i][endCol]);
            }
            // right to left
            for(int j= endCol-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                res.add(matrix[endRow][j]);
            }
            // bottom to top
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol==endCol){
                    break;
                }
                res.add(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return res;
    }
}

