import java.util.ArrayList;
import java.util.List;

public class October162023 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            long prev = 1;
            for(int k=1; k<=rowIndex; k++){
                long next = prev *  (rowIndex-k+1)/k;
                ans.add((int)next);
                prev = next;
            }
            return ans;
        }
    }
}
