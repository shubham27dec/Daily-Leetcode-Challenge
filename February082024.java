public class February082024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n+1];
            for(int i=1; i<=n/i; i++){
                dp[i*i] = 1;
            }
            for(int i=1; i<=n; i++){
                int min = Integer.MAX_VALUE;
                for(int j=1; j*j<=i; j++){
                    min = Math.min(min,dp[j*j]+dp[i-j*j]);
                }
                dp[i] = min;
            }

            return dp[n];
        }
    }
}
