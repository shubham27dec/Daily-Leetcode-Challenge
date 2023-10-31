public class October312023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] findArray(int[] pref) {
            int[] og = new int[pref.length];
            og[0] = pref[0];
            for(int i=1; i<pref.length; i++){
                og[i] = pref[i] ^ pref[i-1];
            }
            return og;
        }
    }
}
