public class July072024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int maxDrink = 0;
            while(numBottles>0){
                maxDrink += Math.min(numExchange,numBottles);   // 9
                numBottles -= numExchange;  // 3
                numBottles++;
            }
            return maxDrink;
        }
    }
}
