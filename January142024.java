import java.util.Arrays;

public class January142024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean closeStrings(String word1, String word2) {
            if(word1.length()!=word2.length()){
                return false;
            }
            int[] charFreq1 = new int[26];
            int[] charFreq2 = new int[26];
            for(int i=0; i<word1.length(); i++){
                charFreq1[word1.charAt(i)-'a']++;
                charFreq2[word2.charAt(i)-'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if ((charFreq1[i] == 0 && charFreq2[i] != 0) || (charFreq1[i] != 0 && charFreq2[i] == 0)) {
                    return false;
                }
            }
            Arrays.sort(charFreq1);
            Arrays.sort(charFreq2);
            return Arrays.equals(charFreq1,charFreq2);
        }
    }
}
