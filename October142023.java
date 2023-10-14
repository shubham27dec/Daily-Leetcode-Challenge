public class October142023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int paintWalls(int[] cost, int[] time) {
            int n = cost.length;
            int[][] dp = new int[n+1][n+1];
            for(int i=1; i<=n; i++){
                dp[n][i] = (int) 1e9;
            }
            int op1;
            int op2;
            for(int i=n-1; i>=0; i--){
                for(int remain=1; remain<=n; remain++){
                    op1 = cost[i] + dp[i+1][Math.max(0,remain-1-time[i])];
                    op2 = dp[i+1][remain];
                    dp[i][remain] = Math.min(op1,op2);
                }
            }
            return dp[0][n];
        }
    }
}
