public class August292023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int bestClosingTime(String customers) {
            int score = 0;
            int maxScore = 0;
            int bestIndex = 0;
            for(int i=0; i<customers.length(); i++){
                if(customers.charAt(i)=='Y'){
                    score++;
                }
                else{
                    score--;
                }
                if(score>maxScore){
                    maxScore = score;
                    bestIndex = i+1;
                }
            }
            return bestIndex;
        }
    }
}
