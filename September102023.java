public class September102023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countOrders(int n) {
            long count=1;
            for(int i=2; i<=n; i++){
                count = (count*(2*i-1)*i) % 1000000007;
            }
            return (int)count;
        }
    }
}
