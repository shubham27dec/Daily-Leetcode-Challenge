import java.util.PriorityQueue;

public class June282024 {
    public static void main(String[] args) {

    }
    class Solution {
        public long maximumImportance(int n, int[][] roads) {
            int[] cityFreq = new int[n];
            for(int[] road : roads){
                cityFreq[road[0]]++;
                cityFreq[road[1]]++;
            }
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(cityFreq[b],cityFreq[a]));
            for(int city=0; city<n; city++){
                maxHeap.offer(city);
            }
            long[] cityImportance = new long[n];
            long currImportance = n;
            while(!maxHeap.isEmpty()){
                cityImportance[maxHeap.poll()] = currImportance--;
            }
            long totalImportance = 0;
            for(int[] road : roads){
                totalImportance += cityImportance[road[0]] + cityImportance[road[1]];
            }
            return totalImportance;
        }
    }
}
