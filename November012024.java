import java.util.ArrayList;
import java.util.List;

public class November012024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String makeFancyString(String s) {
            StringBuilder sb = new StringBuilder();
            int length = s.length();
            int count = 1;
            List<Character> chars = new ArrayList<>();
            for(int i=1; i<length; i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    count++;
                    if(count==3){
                        count--;
                        continue;
                    }
                }
                else{
                    count = 1;
                }
                chars.add(s.charAt(i));
            }
            sb.append(s.charAt(0));
            for(int i=0; i<chars.size(); i++){
                sb.append(chars.get(i));
            }
            return sb.toString();
        }
    }
}
