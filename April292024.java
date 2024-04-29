public class April292024 {
    class Solution {
        public int minOperations(int[] nums, int k) {
            int len = nums.length;
            int xor = nums[0];

            for(int i = 1; i < len; i++) {
                xor = xor^nums[i];
            }

            if(xor == k) return 0;
            return countOperations(xor, k);
        }

        public int countOperations(int xor, int k) {
            int diffBits = 0;
            int xorIthBit = 0, kIthBit = 0;
            for(int i = 0; i < 32; i++) {
                xorIthBit = getIthBit(xor, i);
                kIthBit = getIthBit(k, i);
                if(xorIthBit != kIthBit) {
                    diffBits++;
                }
            }

            return diffBits;
        }

        public static int getIthBit(int n, int i) {
            int bitmask = 1 << i;
            if ((n & bitmask) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
