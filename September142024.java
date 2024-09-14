public class September142024 {
    public static void main(String[] args) {

    }
    class Solution {

        public int longestSubarray(int[] nums) {
            int maxVal = 0, ans = 0, currentStreak = 0;

            for (int num : nums) {
                if (maxVal < num) {
                    maxVal = num;
                    ans = currentStreak = 0;
                }

                if (maxVal == num) {
                    currentStreak++;
                } else {
                    currentStreak = 0;
                }

                ans = Math.max(ans, currentStreak);
            }
            return ans;
        }
    }
}
