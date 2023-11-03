import java.util.ArrayList;
import java.util.List;

public class November032023 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<String> buildArray(int[] target, int n) {
            List<String> ops = new ArrayList<>();
            int ele = 1;
            for(int i=0; i<target.length; i++){
                ops.add("Push");
                if(target[i]!=ele++){
                    i--;
                    ops.add("Pop");
                }
            }
            return ops;
        }
    }
}
