public class December022023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int[] ch = new int[26];
            int goodSum = 0;
            for(char c : chars.toCharArray()){
                ch[c-'a']++;
            }
            for(String word : words){
                int[] wd = new int[26];
                for(char c : word.toCharArray()){
                    wd[c-'a']++;
                }
                boolean isGood = true;
                for(int i=0; i<26; i++){
                    if(wd[i]>ch[i]){
                        isGood = false;
                        break;
                    }
                }
                if(isGood){
                    goodSum += word.length();
                }
            }
            return goodSum;
        }
    }
}
