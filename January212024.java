import java.util.Arrays;

public class January212024 {
    public static void main(String[] args) {

    }
    class Solution {
        int[] dp;
        public int rob(int[] nums) {

            if(nums.length==1){
                return nums[0];
            }
            dp = new int[nums.length];
            Arrays.fill(dp,-1);
            dp[nums.length-1] = nums[nums.length-1];
            dp[nums.length-2] = Math.max(nums[nums.length-2],nums[nums.length-1]);
            return helper(0,nums);
        }

        private int helper(int house, int[] nums){
            if(dp[house]!=-1){
                return dp[house];
            }
            int op1 = nums[house] + helper(house+2,nums);
            int op2 = helper(house+1,nums);
            return dp[house] = Math.max(op1,op2);
        }
    }
}
