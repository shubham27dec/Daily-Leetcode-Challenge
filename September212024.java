import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class September212024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> lexicalOrder(int n) {
            List<String> strings = new ArrayList<>();
            for(int i=1; i<=n; i++){
                strings.add(String.valueOf(i));
            }
            Collections.sort(strings);
            List<Integer> answer = new ArrayList<>();
            for(int i=0; i<n; i++){
                answer.add(Integer.valueOf(strings.get(i)));
            }
            return answer;
        }
    }
}
