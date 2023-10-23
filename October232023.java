public class October232023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isPowerOfFour(int n) {
            return ((n&(n-1))==0 && n%3==1);
        }
    }
}
