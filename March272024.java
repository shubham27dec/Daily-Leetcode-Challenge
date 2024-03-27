public class March272024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if(k <= 1){
                return 0;
            }
            int start = 0;
            int currProduct = 1;
            int subarrays = 0;
            int n = nums.length;
            for(int end=0; end<n; end++){
                currProduct *= nums[end];
                while(start<=end && currProduct >= k){
                    currProduct /= nums[start++];
                }
                subarrays += (end-start+1);
            }
            return subarrays;
        }
    }
}
