import java.util.Arrays;
import java.util.Comparator;

public class August262023 {
    public static void main(String[] args) {

    }

    class Solution {
        public int findLongestChain(int[][] pairs) {
            Arrays.sort(pairs, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return Integer.compare(a[1], b[1]);
                }
            });

            int prev = 0;
            int res = 1;

            for (int i = 1; i < pairs.length; i++) {
                if (pairs[prev][1] < pairs[i][0]) {
                    prev = i;
                    res++;
                }
            }

            return res;
        }
    }
}
