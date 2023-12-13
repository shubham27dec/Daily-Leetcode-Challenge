public class December132023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numSpecial(int[][] mat) {
            int rows = mat.length, cols = mat[0].length;
            int[] rowOnes = new int[rows];
            int[] colOnes = new int[cols];
            for(int row=0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    if(mat[row][col]==1){
                        rowOnes[row]++;
                        colOnes[col]++;
                    }
                }
            }
            int ans = 0;
            for(int row=0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    if(mat[row][col]==1 && rowOnes[row]==1 && colOnes[col]==1){
                        ans++;
                    }
                }
            }
            return ans;
        }
    }
}
