public class September282023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int evenPointer = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]%2==0){
                    int temp = nums[i];
                    nums[i] = nums[evenPointer];
                    nums[evenPointer++] = temp;
                }
            }
            return nums;
        }
    }
}
