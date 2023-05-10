public class May102023 {

    public static void main(String[] args) {

    }

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int term = 1;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n-1;
        while(term <= n*n){
            // left to right
            for(int col=startCol; col<=endCol; col++) {
                if(term>n*n) break;
                res[startRow][col] = term;
                term++;
            }
            // top to bottom
            for(int row=startRow+1; row<=endRow; row++){
                if(term>n*n) break;
                res[row][endCol] = term;
                term++;
            }
            // right to left
            for(int col=endCol-1; col>=startCol; col--){
                if(term>n*n) break;
                res[endRow][col] = term;
                term++;
            }
            // left
            for(int row=endRow-1; row>startRow; row--){
                if(term>n*n) break;
                res[row][startCol] = term;
                term++;
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return res;
    }
}
