public class May302024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countTriplets(int[] arr) {
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                int val = arr[i];

                for (int k = i + 1; k < arr.length; k++) {
                    val = val ^ arr[k];

                    if (val == 0) {
                        count += (k - i);
                    }
                }
            }

            return count;
        }
    }
}
