public class September012023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] countBits(int n) {
            int[] setBitsCount = new int[n+1];
            for(int i=0; i<=n; i++){
                int num = i, count = 0;
                while(num>0){
                    if((1&num)==1){
                        count++;
                    }
                    num = num>>1;
                }
                setBitsCount[i] = count;
            }
            return setBitsCount;
        }
    }
}
