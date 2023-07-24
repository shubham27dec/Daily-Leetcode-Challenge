public class July242023 {
    public static void main(String[] args) {

    }
    class Solution {
        public double myPow(double x, int n) {
            // Your code goes here
            long num = n;
            if(n==0){
                return 1.00000;
            }
            if(n<0){
                return 1/raising(x,-1*num);
            }
            return raising(x,num);
        }
        double raising(double x,  long n){
            if(n==1){
                return x;
            }
            if(n%2!=0){
                return x*raising(x*x,  n/2);
            }
            return raising(x*x, n/2);
        }
    }
}
