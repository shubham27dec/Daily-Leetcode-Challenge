public class December042023 {
    public static void main(String[] args) {

    }
    class Solution {
        public String largestGoodInteger(String num) {
            int largestGoodInteger = -1;
            for(int i=0; i<num.length()-2; i++){
                if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                    int goodInteger = Integer.valueOf(num.substring(i,i+3));
                    i += 2;
                    largestGoodInteger = Math.max(largestGoodInteger,goodInteger);
                }
            }
            if(largestGoodInteger==0){
                return "000";
            }
            return largestGoodInteger==-1?"":String.valueOf(largestGoodInteger);
        }
    }
}
