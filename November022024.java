public class November022024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isCircularSentence(String sentence) {
            char first = sentence.charAt(0);
            int n = sentence.length();
            char last = sentence.charAt(n-1);
            if(last!=first){
                return false;
            }
            for(int i=0; i<n-1; i++){
                if(sentence.charAt(i+1)==' '){
                    last = sentence.charAt(i);
                    first = sentence.charAt(i+2);
                    if(last!=first){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
