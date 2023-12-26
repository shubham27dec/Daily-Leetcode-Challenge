public class December262023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numRollsToTarget(int n, int k, int target) {
            final int mod = (int) 1e9 + 7;
            int[][] dp = new int[n + 1][target + 1];

            dp[0][0] = 1;

            for (int dice = 1; dice <= n; dice++) {
                for (int tar = 1; tar <= target; tar++) {
                    for (int i = 1; i <= k; i++) {
                        if (tar - i >= 0) {
                            dp[dice][tar] = (dp[dice][tar] + dp[dice - 1][tar - i]) % mod;
                        }
                    }
                }
            }

            return dp[n][target];
        }
    }
}
