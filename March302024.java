import java.util.HashMap;
import java.util.Map;

public class March302024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int subarraysWithKDistinct(int[] nums, int k) {
            int subarraysAtmostk = subarraysWithAtmostK(nums,k);
            int subarraysLessk = subarraysWithAtmostK(nums,k-1);
            return subarraysAtmostk-subarraysLessk;
        }

        private int subarraysWithAtmostK(int[] nums, int k){
            Map<Integer,Integer> numFreq = new HashMap<>();
            int subarrays = 0;
            int n = nums.length;
            int start =0;
            for(int end=0; end<n; end++){
                numFreq.put(nums[end],numFreq.getOrDefault(nums[end],0)+1);
                while(numFreq.size()>k){
                    numFreq.put(nums[start],numFreq.get(nums[start])-1);
                    if(numFreq.get(nums[start])==0){
                        numFreq.remove(nums[start]);
                    }
                    start++;
                }
                subarrays += (end-start+1);
            }
            return subarrays;
        }
    }
}
