public class March242024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findDuplicate(int[] nums) {
            int i = 0;
            int n = nums.length;
            while(i<n){
                int num = nums[i];
                if(num!=i+1){
                    if(nums[num-1] == num){
                        return num;
                    }
                    nums[i] = nums[num-1];
                    nums[num-1] = num;
                }
                else{
                    i++;
                }
            }
            return 0;
        }
    }
}
