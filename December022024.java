public class December022024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int isPrefixOfWord(String sentence, String searchWord) {
            String[] words = sentence.split(" ");
            for(int i=0; i<words.length; i++){
                String word = words[i];
                if(word.startsWith(searchWord)){
                    return i+1;
                }
            }
            return -1;
        }
    }
}
