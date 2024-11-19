import java.util.HashMap;
import java.util.Map;

public class November192024 {
    public static void main(String[] args) {

    }
    class Solution {
        public long maximumSubarraySum(int[] nums, int k) {
            long maxSum = 0;
            int left = 0;
            long currSum = 0;
            Map<Integer,Integer> numFreq = new HashMap<>();
            for(int right=0; right<nums.length; right++){
                numFreq.put(nums[right],numFreq.getOrDefault(nums[right],0)+1);
                currSum += nums[right];
                if(right-left+1==k){
                    if(numFreq.size()==k && currSum>maxSum){
                        maxSum = currSum;
                    }
                    currSum -= nums[left];
                    numFreq.put(nums[left],numFreq.get(nums[left])-1);
                    if(numFreq.get(nums[left])==0){
                        numFreq.remove(nums[left]);
                    }
                    left++;
                }
            }
            return maxSum;
        }
    }
}
