import java.util.*;

public class February162024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findLeastNumOfUniqueInts(int[] arr, int k) {
            Map<Integer,Integer> numFreq = new HashMap<>();
            for(int num : arr){
                numFreq.put(num,numFreq.getOrDefault(num,0)+1);
            }
            List<Integer> freqs = new ArrayList<>();
            for(int freq : numFreq.values()){
                freqs.add(freq);
            }
            Collections.sort(freqs);
            while(true){
                if(freqs.isEmpty() || freqs.get(0)>k){
                    break;
                }
                else{
                    k -= freqs.get(0);
                    freqs.remove(0);
                }
            }
            return freqs.size();
        }
    }
}
