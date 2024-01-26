public class January262024 {
    public static void main(String[] args) {

    }
    class Solution {

        int[][][] dp = new int[51][51][51];
        int mod = 1000000007;

        public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
            for(int i=0; i<51; i++){
                for(int j=0; j<51; j++){
                    for(int k=0; k<51; k++){
                        dp[i][j][k] = -1;
                    }
                }
            }
            return solve(m,n,maxMove,startRow,startColumn);
        }

        private int solve(int m, int n, int maxMove, int startRow, int startColumn){
            if(startRow<0 || startColumn<0 || startRow>=m || startColumn>=n){
                return 1;
            }
            if(maxMove<=0){
                return 0;
            }
            if(dp[maxMove][startRow][startColumn] != -1){
                return dp[maxMove][startRow][startColumn];
            }
            int left = solve(m,n,maxMove-1,startRow,startColumn-1);
            int right = solve(m,n,maxMove-1,startRow,startColumn+1);
            int up = solve(m,n,maxMove-1,startRow-1,startColumn);
            int down = solve(m,n,maxMove-1,startRow+1,startColumn);
            return dp[maxMove][startRow][startColumn]=((up%mod+down%mod)%mod+(left%mod+right%mod)%mod) % mod;
        }
    }
}
