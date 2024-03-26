public class March262024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
            for(int i=0; i<n; i++){
                if(nums[i] > n || nums[i] <= 0 || nums[i] == i+1){
                    continue;
                }
                int correctIndex = nums[i]-1;
                if(nums[i]==nums[correctIndex]){
                    continue;
                }
                nums[i] = nums[correctIndex];
                nums[correctIndex] = correctIndex+1;
                i--;
            }
            for(int i=0; i<n; i++){
                if(nums[i] != i+1){
                    return i+1;
                }
            }
            return n+1;
        }
    }
}
