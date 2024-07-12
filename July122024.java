public class July122024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maximumGain(String s, int x, int y) {
            String[] str = new String[]{s};
            int[] maxScore = new int[]{0};
            if(x>=y){
                checkAndRemove(str,maxScore,'a','b',x);
                checkAndRemove(str,maxScore,'b','a',y);
            }
            else{
                checkAndRemove(str,maxScore,'b','a',y);
                checkAndRemove(str,maxScore,'a','b',x);
            }
            return maxScore[0];
        }

        void checkAndRemove(String[] str, int[] maxScore, char c1, char c2, int inc){
            StringBuilder sb = new StringBuilder(str[0]);
            int score = maxScore[0];
            for(int i=0; i<sb.length()-1; i++){
                if(sb.charAt(i)==c1 && sb.charAt(i+1)==c2){
                    sb.delete(i,i+2);
                    score += inc;
                    if(i>0){
                        i--;
                    }
                    i--;
                }
            }
            str[0] = sb.toString();
            maxScore[0] = score;
        }
    }
}
