public class December222023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxScore(String s) {
            int score = 0;
            for(int i=1; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    score++;
                }
            }
            if(s.charAt(0)=='0'){
                score++;
            }
            int maxScore = score;
            for(int i=1; i<s.length()-1; i++){
                if(s.charAt(i)=='1'){
                    score--;
                }
                else{
                    score++;
                    maxScore = Math.max(score,maxScore);
                }
            }
            return maxScore;
        }
    }
}
