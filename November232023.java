import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class November232023 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
            List<Boolean> ans = new ArrayList<>();
            int m = l.length;

            for (int i = 0; i < m; i++) {
                int[] v = Arrays.copyOfRange(nums, l[i], r[i] + 1);
                Arrays.sort(v);

                boolean isArith = true;
                if (v.length > 1) {
                    int diff = v[1] - v[0];
                    for (int j = 1; j < v.length; j++) {
                        if (v[j] - v[j - 1] != diff) {
                            isArith = false;
                            break;
                        }
                    }
                } else {
                    isArith = false;
                }
                ans.add(isArith);
            }

            return ans;
        }
    }
}
