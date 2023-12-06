public class December062023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int totalMoney(int n) {
            int mondayMoney = 1;
            int totalMoney = 0;
            while(n>7){
                int sundayMoney = mondayMoney + 6;
                totalMoney += ((sundayMoney*(sundayMoney+1))/2) - ((mondayMoney*(mondayMoney-1))/2) ;
                n -= 7;
                mondayMoney++;
            }
            int lastDayMoney = mondayMoney + (n-1);
            totalMoney += ((lastDayMoney*(lastDayMoney+1))/2) - ((mondayMoney*(mondayMoney-1))/2) ;
            return totalMoney;
        }
    }
}
