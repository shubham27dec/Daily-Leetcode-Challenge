import java.util.Arrays;

public class February152024 {
    public static void main(String[] args) {

    }
    class Solution {
        public long largestPerimeter(int[] nums) {
            Arrays.sort(nums);
            int numberOfSides = nums.length;
            long sumsOfOtherSides = 0;
            for(int num : nums){
                sumsOfOtherSides += num;
            }
            for(int i=numberOfSides-1; i>=2; i--){
                long longestSide = nums[i];
                sumsOfOtherSides -= longestSide;
                if(sumsOfOtherSides>longestSide){
                    return sumsOfOtherSides + longestSide;
                }
            }
            return -1;
        }
    }
}
