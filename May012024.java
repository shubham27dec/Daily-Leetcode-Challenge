public class May012024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String reversePrefix(String word, char ch) {
            int index = word.indexOf(ch);
            if(index!=-1){
                StringBuilder sb = new StringBuilder(word.substring(0,index+1));
                sb.reverse();
                sb.append(word.substring(index+1));
                return sb.toString();
            }
            return word;
        }
    }
}
