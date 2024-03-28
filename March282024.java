import java.util.HashMap;
import java.util.Map;

public class March282024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxSubarrayLength(int[] nums, int k) {
            int maxLength = 1;
            Map<Integer,Integer> numFreq = new HashMap<>();
            int start = 0;
            int n = nums.length;
            for(int end=0; end<n; end++){
                numFreq.put(nums[end],numFreq.getOrDefault(nums[end],0)+1);
                while(numFreq.get(nums[end])>k){
                    numFreq.put(nums[start],numFreq.get(nums[start])-1);
                    start++;
                }
                maxLength = Math.max(maxLength,end-start+1);
            }
            return maxLength;
        }
    }
}
