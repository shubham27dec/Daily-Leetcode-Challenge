import java.util.Arrays;

public class November242023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxCoins(int[] piles) {
            Arrays.sort(piles);
            int coins = 0;
            int passes = 0;
            for(int i=piles.length-2; i>passes++;i-=2){
                coins += piles[i];
            }
            return coins;
        }
    }
}
