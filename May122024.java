public class May122024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[][] largestLocal(int[][] grid) {
            int n = grid.length;
            int[][] maxLocal = new int[n-2][n-2];
            for(int i=0; i<n-2; i++){
                for(int j=0; j<n-2; j++){
                    int max = 0;
                    for(int row = i; row<i+3; row++){
                        for(int col = j; col<j+3; col++){
                            max = Math.max(max,grid[row][col]);
                        }
                    }
                    maxLocal[i][j] = max;
                }
            }
            return maxLocal;
        }
    }
}
