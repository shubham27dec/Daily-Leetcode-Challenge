public class February052024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int firstUniqChar(String s) {
            int[] charFreq = new int[26];
            int n = s.length();

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                charFreq[c-'a']++;
            }

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (charFreq[c-'a'] == 1){
                    return i;
                }
            }
            return -1;
        }
    }
}
