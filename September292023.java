public class September292023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isMonotonic(int[] nums) {
            boolean isMonotonic = true;
            for(int i=1; i<nums.length; i++){
                if(nums[i]<nums[i-1]){
                    isMonotonic = false;
                    break;
                }
            }
            if(isMonotonic){
                return true;
            }
            isMonotonic = true;
            for(int i=1; i<nums.length; i++){
                if(nums[i]>nums[i-1]){
                    isMonotonic = false;
                    break;
                }
            }
            if(isMonotonic){
                return true;
            }
            return false;
        }
    }
}
