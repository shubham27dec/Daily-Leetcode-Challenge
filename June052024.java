import java.util.ArrayList;
import java.util.List;

public class June052024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<String> commonChars(String[] words) {
            int[] charFreq = new int[26];
            for(char c : words[0].toCharArray()){
                charFreq[c-'a']++;
            }
            for(String word : words){
                int[] tempFreq = new int[26];
                for(char c : word.toCharArray()){
                    tempFreq[c-'a']++;
                }
                for(int i=0; i<26; i++){
                    charFreq[i] = Math.min(charFreq[i],tempFreq[i]);
                }
            }
            List<String> commonChars = new ArrayList<>();
            for(int i=0; i<26; i++){
                while(charFreq[i]>0){
                    charFreq[i]--;
                    commonChars.add(String.valueOf((char)('a'+i)));
                }
            }
            return commonChars;
        }
    }
}
