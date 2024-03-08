import java.util.HashMap;
import java.util.Map;

public class March082024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            Map<Integer,Integer> eleFreq = new HashMap<>();
            int maxFrequency = 0;
            for(int num : nums){
                eleFreq.put(num,eleFreq.getOrDefault(num,0)+1);
                maxFrequency = Math.max(maxFrequency,eleFreq.get(num));
            }
            int maxFreqElements = 0;
            for(int num : nums){
                if(maxFrequency == eleFreq.get(num)){
                    maxFreqElements++;
                }
            }
            return maxFreqElements;
        }
    }
}
