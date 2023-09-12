import java.util.HashMap;
import java.util.HashSet;

public class September122023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minDeletions(String s) {
            HashMap<Character,Integer> charFreq = new HashMap<>();
            for(char c : s.toCharArray()){
                charFreq.put(c,charFreq.getOrDefault(c,0)+1);
            }
            int deletions  = 0;
            HashSet<Integer> frequencies = new HashSet<>();
            for(int freq : charFreq.values()){
                while(freq>0 && frequencies.contains(freq)){
                    freq--;
                    deletions++;
                }
                frequencies.add(freq);
            }
            return deletions;
        }
    }
}
