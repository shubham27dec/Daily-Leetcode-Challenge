public class August012024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countSeniors(String[] details) {
            int seniorsCount = 0;
            for(String detail : details){
                if(Integer.valueOf(detail.substring(11,13))>60){
                    seniorsCount++;
                }
            }
            return seniorsCount;
        }
    }
}
