import java.util.Arrays;

public class March042024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int bagOfTokensScore(int[] tokens, int power) {
            Arrays.sort(tokens);
            int score = 0;
            int maxScore = 0;
            int start = 0, end= tokens.length-1;
            while(start<=end){
                if(power>=tokens[start]){
                    score++;
                    maxScore = Math.max(maxScore, score);
                    power -= tokens[start++];
                }
                else if(score>0){
                    score--;
                    power += tokens[end--];
                }
                else{
                    start++;
                }
            }
            return maxScore;
        }
    }
}
