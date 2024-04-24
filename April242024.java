public class April242024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int tribonacci(int n) {
            int t0 = 0;
            int t1 = 1;
            int t2 = 1;
            if(n==0){
                return 0;
            }
            if(n==1 || n==2){
                return 1;
            }
            int ans = 0;
            for(int i=3; i<=n; i++){
                ans = t0+t1+t2;
                t0 = t1;
                t1 = t2;
                t2 = ans;
            }
            return ans;
        }
    }
}
