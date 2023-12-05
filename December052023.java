public class December052023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numberOfMatches(int n) {
            int matches=  0;
            while(n>1){
                matches += n/2;
                if(n%2==0){
                    n /=2;
                }
                else{
                    n = (int)Math.ceil(n/2.0);
                }
            }
            return matches;
        }
    }
}
