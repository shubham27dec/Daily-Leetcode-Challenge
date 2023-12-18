public class December182023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxProductDifference(int[] nums) {
            int max = 0, secondMax = 0, min = 1000001, secondMin = 1000001;
            for(int num : nums){
                if(num>=max){
                    secondMax = max;
                    max = num;
                }
                else if(num>=secondMax){
                    secondMax = num;
                }
                if(num<=min){
                    secondMin = min;
                    min = num;
                }
                else if(num<=secondMin){
                    secondMin = num;
                }
            }
            return (max*secondMax) - (min*secondMin);
        }
    }
}
