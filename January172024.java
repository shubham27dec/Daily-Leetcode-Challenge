import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class January172024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer,Integer> frequencies = new HashMap<>();
            for(int ele : arr){
                frequencies.put(ele,frequencies.getOrDefault(ele,0)+1);
            }
            Set<Integer> uniqueFrequencies = new HashSet<>();
            for(int frequency : frequencies.values()){
                if(!uniqueFrequencies.add(frequency)){
                    return false;
                }
            }
            return true;
        }
    }
}
