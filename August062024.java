import java.util.Arrays;

public class August062024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minimumPushes(String word) {
            int[] charFreq = new int[26];
            int n = word.length();
            for(int i=0; i<n; i++){
                charFreq[word.charAt(i)-'a']++;
            }
            Arrays.sort(charFreq);
            int keysUsed = 0;
            int pushes = 0;
            for(int i=25; i>=0; i--){
                int freq = charFreq[i];
                if(freq==0){
                    break;
                }
                if(keysUsed<8){
                    pushes += freq;
                    keysUsed++;
                }
                else if(keysUsed<16){
                    pushes += (freq*2);
                    keysUsed++;
                }
                else if(keysUsed<24){
                    pushes += (freq*3);
                    keysUsed++;
                }
                else{
                    pushes += (freq*4);
                }
            }
            return pushes;
        }
    }
}
