public class December202023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int buyChoco(int[] prices, int money) {
            int minPrice = 101;
            int minPrice2 = 101;
            for(int price : prices){
                if(price<=minPrice){
                    minPrice2 = minPrice;
                    minPrice = price;
                }
                else if(price<=minPrice2){
                    minPrice2 = price;
                }
            }
            if((minPrice + minPrice2)>money){
                return money;
            }
            return money - (minPrice+minPrice2);
        }
    }
}
