public class December122023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxProduct(int[] nums) {
            int maxValue=0, secondMaxValue=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]>=maxValue){
                    secondMaxValue = maxValue;
                    maxValue = nums[i];
                }
                else if(nums[i]>=secondMaxValue){
                    secondMaxValue = nums[i];
                }
            }
            return (maxValue-1)*(secondMaxValue-1);
        }
    }
}
