public class December162023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isAnagram(String s, String t) {
            int[] schars = new int[26];
            int[] tchars = new int[26];
            for(char c : s.toCharArray()){
                schars[c-'a']++;
            }
            for(char c : t.toCharArray()){
                tchars[c-'a']++;
            }
            for(int i=0; i<26; i++){
                if(schars[i]!=tchars[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
