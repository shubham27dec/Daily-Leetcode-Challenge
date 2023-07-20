public class July052023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int longestSubarray(int[] nums) {
            int prev = 0; int curr = 0;
            int ans = 0;
            for(int i: nums){
                if(i==1) curr++;
                else{
                    ans = Math.max(ans,curr+prev);
                    prev = curr;
                    curr = 0;
                }
            }
            ans = Math.max(ans, curr+prev);

            return ans==nums.length?ans-1:ans;
        }
    }
}