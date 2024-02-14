public class February142024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int positiveIndex = 0;
            int negativeIndex = 1;
            int[] answer = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                if(nums[i]>0){
                    answer[positiveIndex] = nums[i];
                    positiveIndex += 2;
                }
                else{
                    answer[negativeIndex] = nums[i];
                    negativeIndex += 2;
                }
            }
            return answer;
        }
    }
}
