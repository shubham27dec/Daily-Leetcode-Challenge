public class January132023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minSteps(String s, String t) {
            int[] charFreq = new int[26];
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                charFreq[c-'a']++;
            }
            for(int i=0; i<t.length(); i++){
                char c = t.charAt(i);
                charFreq[c-'a']--;
            }
            int operations = 0;
            for(int freq : charFreq){
                operations += Math.abs(freq);
            }
            return operations/2;
        }
    }
}
