import java.util.HashMap;
import java.util.Map;

public class January042023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minOperations(int[] nums) {
            Map<Integer,Integer> numFreq = new HashMap<>();
            int minOperations = 0;
            for(int num : nums){
                numFreq.put(num,numFreq.getOrDefault(num,0)+1);
            }
            for(int freq : numFreq.values()){
                if(freq==1){
                    return -1;
                }
                minOperations += (freq/3);
                if(freq%3!=0){
                    minOperations++;
                }
            }
            return minOperations;
        }
    }
}
