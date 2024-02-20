public class February202024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
        /* Counting Sort
        for(int i=0; i<n; i++){
            int correctIndex = nums[i];
            if(correctIndex != i && correctIndex <n){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
                i--;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
        */
            int expectedSum = (n*(n+1))/2;
            int actualSum = 0;
            for(int num : nums){
                actualSum += num;
            }
            return expectedSum - actualSum;
        }
    }
}
