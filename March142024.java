import java.util.HashMap;
import java.util.Map;

public class March142024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            Map<Integer,Integer> prefixSumFreq = new HashMap<>();
            int n = nums.length;
            int subarraysWithSum = 0;
            int runningSum = 0;
            for(int i=0; i<n; i++){
                runningSum += nums[i];
                if(runningSum==goal){
                    subarraysWithSum++;
                }
                int diff = runningSum - goal;
                subarraysWithSum += prefixSumFreq.getOrDefault(diff,0);
                prefixSumFreq.put(runningSum,prefixSumFreq.getOrDefault(runningSum,0)+1);
            }
            return subarraysWithSum;
        }
    }
}
