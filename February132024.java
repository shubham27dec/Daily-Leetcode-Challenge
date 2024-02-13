public class February132024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String firstPalindrome(String[] words) {
            for(String word : words){
                if(isPalindromic(word)){
                    return word;
                }
            }
            return "";
        }

        private boolean isPalindromic(String word){
            int wordLength = word.length();
            for(int i=0; i<wordLength/2; i++){
                if(word.charAt(i) != word.charAt(wordLength-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
}
