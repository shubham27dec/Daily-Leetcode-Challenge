public class December302023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean makeEqual(String[] words) {
            int[] charFreq = new int[26];
            for(String word : words){
                for(char c : word.toCharArray()){
                    charFreq[c-'a']++;
                }
            }
            for(int freq : charFreq){
                if(freq%words.length != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
