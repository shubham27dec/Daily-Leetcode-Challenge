import java.util.Arrays;

public class November072023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int eliminateMaximum(int[] dist, int[] speed) {
            double[] timeTaken = new double[dist.length];
            int eliminated = 0;
            for(int i=0; i<dist.length; i++){
                timeTaken[i] = (dist[i]*1.0)/speed[i];
            }
            Arrays.sort(timeTaken);
            for(int i=0; i<dist.length; i++){
                if(timeTaken[i]<=i){
                    return eliminated;
                }
                eliminated++;
            }
            return eliminated;
        }
    }
}
