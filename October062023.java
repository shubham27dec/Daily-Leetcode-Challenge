public class October062023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int integerBreak(int n) {
            if(n==2){
                return 1;
            }
            if(n==3){
                return 2;
            }

            int count = n/3;
            int rem = n%3;

            if(rem==0){
                return (int)Math.pow(3,count);
            }
            if(rem==1){
                return (int)Math.pow(3,count-1)*4;
            }
            return (int)Math.pow(3,count)*2;
        }
    }
}
