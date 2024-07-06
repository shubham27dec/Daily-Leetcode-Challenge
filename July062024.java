public class July062024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int passThePillow(int n, int time) {
            int moves = time % (n-1);
            int cycle = time / (n-1);
            if(cycle%2==0){
                return 1 + moves;
            }
            return n - moves;
        }
    }
}
