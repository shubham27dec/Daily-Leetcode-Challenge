import java.util.Arrays;

public class November042023 {
    public static void main(String[] args) {

    }
    public class Solution {
        public int getLastMoment(int n, int[] left, int[] right) {
            int maxLeft = left.length == 0 ? 0 : Arrays.stream(left).max().getAsInt();
            int minRight = right.length == 0 ? n : Arrays.stream(right).min().getAsInt();
            return Math.max(maxLeft, n - minRight);
        }
    }
}
