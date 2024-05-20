public class May202024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int subsetXORSum(int[] nums) {
            return solve(0,0,nums);
        }

        int solve(int xor, int i, int[] nums){
            if(i==nums.length){
                return xor;
            }
            return solve(xor^nums[i],i+1,nums) + solve(xor,i+1,nums);
        }
    }
}
