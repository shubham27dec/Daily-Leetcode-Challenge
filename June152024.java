import java.util.Arrays;
import java.util.PriorityQueue;

public class June152024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
            int n = profits.length;
            int[][] capitalProfits = new int[n][2];
            for(int i=0; i<n; i++){
                capitalProfits[i][0] = capital[i];
                capitalProfits[i][1] = profits[i];
            }
            Arrays.sort(capitalProfits,(a, b)->Integer.compare(a[0],b[0]));
            int i=0;
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->Integer.compare(b[1],a[1]));
            while(k-->0){
                while(i<n && capitalProfits[i][0]<=w){
                    pq.offer(capitalProfits[i++]);
                }
                if(!pq.isEmpty()){
                    w += pq.poll()[1];
                }
            }
            return w;
        }
    }
}
