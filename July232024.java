import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class July232024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer,Integer> numFreq = new HashMap<>();
            for(int num : nums){
                numFreq.put(num,numFreq.getOrDefault(num,0)+1);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->
            {
                if(numFreq.get(a)==numFreq.get(b)){
                    return Integer.compare(b,a);
                }
                return Integer.compare(numFreq.get(a),numFreq.get(b));
            });
            for(int num : nums){
                pq.offer(num);
            }
            int[] freqSortedNums = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                freqSortedNums[i] = pq.poll();
            }
            return freqSortedNums;
        }
    }
}
