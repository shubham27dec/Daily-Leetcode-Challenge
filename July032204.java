import java.util.Arrays;

public class July032204 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minDifference(int[] nums) {    // [1,5,0,10,14]
            if(nums.length<=4){
                return 0;
            }
            int[] numsCopy = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                numsCopy[i] = nums[i];
            }
            Arrays.sort(numsCopy);   // [0,1,5,10,14]
            int ans = Integer.MAX_VALUE;
            ans = Math.min(ans,numsCopy[nums.length-1] - numsCopy[3]);  // first 3 indexes set to max
            ans = Math.min(ans,numsCopy[nums.length-2] - numsCopy[2]);  // first 2 indexes set to max, last index set min
            ans = Math.min(ans,numsCopy[nums.length-3] - numsCopy[1]);  // first 1 index set to max, last 2 indexes set min
            ans = Math.min(ans,numsCopy[nums.length-4] - numsCopy[0]);  // last 3 indexes set min
            return ans;
        }
    }
}
