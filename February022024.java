import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class February022024 {
    public static void main(String[] args) {

    }
    class Solution {
        public static List<Integer> sequentialDigits(int low, int high) {
            List<Integer> result = new ArrayList<>();

            for (int i = 1; i <= 9; i++) {
                int num = i;

                for (int j = i + 1; j <= 9; j++) {
                    num = num * 10 + j;

                    if (num >= low && num <= high) {
                        result.add(num);
                    }
                }
            }

            Collections.sort(result);
            return result;
        }
    }
}
