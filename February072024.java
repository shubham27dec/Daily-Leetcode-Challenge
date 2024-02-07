import java.util.Arrays;

public class February072024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String frequencySort(String s) {
            int[][] charFreq = new int[128][2];

            for(int i=0; i<128; i++){
                charFreq[i][0] = i;
            }

            for(int i=0; i<s.length(); i++){
                charFreq[s.charAt(i)][1]++;
            }

            Arrays.sort(charFreq, (a, b) -> Integer.compare(b[1],a[1]));
            StringBuilder answer = new StringBuilder();
            for(int i=0; i<128; i++){
                for(int j=0; j<charFreq[i][1]; j++){
                    answer.append((char)charFreq[i][0]);
                }
            }
            return answer.toString();
        }
    }
}
