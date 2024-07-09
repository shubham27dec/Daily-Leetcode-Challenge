public class July092024 {
    public static void main(String[] args) {

    }
    class Solution {
        public double averageWaitingTime(int[][] customers) {
            double waitTime = 0.0;
            int chefAvailable = 0;
            for(int[] customer : customers){
                chefAvailable = Math.max(chefAvailable,customer[0]);
                chefAvailable += customer[1];
                waitTime += chefAvailable-customer[0];

            }
            return waitTime/customers.length;
        }
    }
}
