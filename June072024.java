import java.util.Collections;
import java.util.List;

public class June072024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String replaceWords(List<String> dictionary, String sentence) {
            Collections.sort(dictionary,(a, b) -> Integer.compare(a.length(),b.length()));
            StringBuilder sb = new StringBuilder();
            String[] words = sentence.split(" ");
            for(String word : words){
                if(sb.length()!=0){
                    sb.append(" ");
                }
                boolean rootFound = false;
                for(String root : dictionary){
                    if(word.startsWith(root)){
                        rootFound = true;
                        sb.append(root);
                        break;
                    }
                }
                if(!rootFound){
                    sb.append(word);
                }
            }
            return sb.toString();
        }
    }
}
