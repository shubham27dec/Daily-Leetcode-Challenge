import java.util.Arrays;

public class August142023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length-k];
        }
    }
}
