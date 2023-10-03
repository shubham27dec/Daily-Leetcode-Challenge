import java.util.HashMap;

public class October032023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            HashMap<Integer,Integer> numFreq = new HashMap<>();
            int goodPairs = 0;
            for(int num : nums){
                goodPairs += numFreq.getOrDefault(num,0);
                numFreq.put(num,numFreq.getOrDefault(num,0)+1);
            }
            return goodPairs;
        }
    }
}
