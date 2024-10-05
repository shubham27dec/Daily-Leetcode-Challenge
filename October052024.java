public class October052024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if(s1.length()>s2.length()){
                return false;
            }
            int[] charFreq1 = new int[26];
            int n = s1.length();
            for(int i=0; i<n; i++){
                charFreq1[s1.charAt(i)-'a']++;
            }
            int left = 0;
            int[] charFreq2 = new int[26];
            int m = s2.length();
            for(int right=0; right<m; right++){
                charFreq2[s2.charAt(right)-'a']++;
                if(right-left+1==n){
                    if(sameFreq(charFreq1,charFreq2)){
                        return true;
                    }
                    charFreq2[s2.charAt(left++)-'a']--;
                }
            }
            return false;
        }

        private boolean sameFreq(int[] freq1, int[] freq2){
            for(int i=0; i<26; i++){
                if(freq1[i]!=freq2[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
