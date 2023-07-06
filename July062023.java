import java.util.TreeMap;

public class July062023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int prefixSum = 0;
            int minLen = nums.length + 1;
            TreeMap<Integer, Integer> prefixSumIndex = new TreeMap<>();
            for(int i=0; i<nums.length; i++){
                prefixSum += nums[i];
                if(prefixSum >= target){
                    minLen = Math.min(minLen,i+1);
                }
                int extraSum = prefixSum - target;
                if(prefixSumIndex.floorKey(extraSum) != null){
                    int size = i - prefixSumIndex.get(prefixSumIndex.floorKey(extraSum));
                    minLen = Math.min(minLen,size);
                }

                prefixSumIndex.put(prefixSum,i);

            }
            return minLen > nums.length ? 0 : minLen;
        }
    }
}
