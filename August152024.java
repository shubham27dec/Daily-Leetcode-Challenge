public class August152024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int fiveBills = 0;
            int tenBills = 0;
            for(int bill : bills){
                if(bill==20){
                    int returnAmount = 15;
                    if(tenBills>=1){
                        tenBills--;
                        returnAmount -= 10;
                    }
                    if(returnAmount==5){
                        if(fiveBills>=1){
                            fiveBills--;
                            continue;
                        }
                        else{
                            return false;
                        }
                    }

                    if(returnAmount==15){
                        if(fiveBills>=3){
                            fiveBills -= 3;
                            continue;
                        }
                        else{
                            return false;
                        }
                    }

                }
                else if(bill==10){
                    tenBills++;
                    if(fiveBills>=1){
                        fiveBills--;
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    fiveBills++;
                }
            }
            return true;
        }
    }
}
