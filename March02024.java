public class March02024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] sortedSquares = new int[n];
            int start = 0, end = n-1;
            for(int i=n-1; i>=0; i--){
                if(nums[end]*nums[end] >= nums[start]*nums[start]){
                    sortedSquares[i] = nums[end]*nums[end];
                    end--;
                }
                else{
                    sortedSquares[i] = nums[start]*nums[start];
                    start++;
                }
            }
            return sortedSquares;
        }
    }
}
