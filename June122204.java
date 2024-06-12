public class June122204 {
    public static void main(String[] args) {

    }
    class Solution {
        public void sortColors(int[] nums) {
            int n = nums.length;
            int zeroIndex = 0;
            int twoIndex = nums.length-1;
            for(int i=0; i<=twoIndex; i++){
                int ele = nums[i];
                if(ele==2){
                    swap(i--,twoIndex--,nums);
                }
                else if(ele==0){
                    swap(i,zeroIndex++,nums);
                }
            }
        }

        void swap(int i, int j, int[] nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
