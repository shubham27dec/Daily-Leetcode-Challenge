import java.util.Arrays;
import java.util.PriorityQueue;

public class June182024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
            int numJobs = difficulty.length;
            int numWorkers = worker.length;
            int[][] profitDifficulty = new int[numJobs][2];
            for(int jobNum=0; jobNum<numJobs; jobNum++){
                profitDifficulty[jobNum][0] = profit[jobNum];
                profitDifficulty[jobNum][1] = difficulty[jobNum];
            }
            Arrays.sort(worker);
            Arrays.sort(profitDifficulty,(a,b) -> Integer.compare(a[1],b[1]));
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b)->Integer.compare(profitDifficulty[b][0],profitDifficulty[a][0]));
            int jobNum = 0;
            int workerNum =0;
            int maxProfit = 0;
            while(workerNum<numWorkers){
                while(jobNum<numJobs && profitDifficulty[jobNum][1]<=worker[workerNum]){
                    maxHeap.offer(jobNum);
                    jobNum++;
                }
                if(!maxHeap.isEmpty()){
                    maxProfit += profitDifficulty[maxHeap.peek()][0];
                }
                workerNum++;
            }
            return maxProfit;
        }
    }
}
