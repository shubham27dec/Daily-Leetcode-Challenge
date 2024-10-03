import java.util.Arrays;
import java.util.HashMap;

public class October022024 {
    public static void main(String[] args) {

    }
    class Solution {

        public int[] arrayRankTransform(int[] arr) {
            // Store the rank for each number in arr
            HashMap<Integer, Integer> numToRank = new HashMap<>();
            int[] sortedArr = Arrays.copyOf(arr, arr.length);
            Arrays.sort(sortedArr);
            int rank = 1;
            for (int i = 0; i < sortedArr.length; i++) {
                if (i > 0 && sortedArr[i] > sortedArr[i - 1]) {
                    rank++;
                }
                numToRank.put(sortedArr[i], rank);
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = numToRank.get(arr[i]);
            }
            return arr;
        }
    }
}
