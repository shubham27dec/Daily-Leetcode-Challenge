import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class July212024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
            List<Integer> rowSort = getTopologicalSort(rowConditions,k);
            List<Integer> colSort = getTopologicalSort(colConditions,k);
            if(rowSort.size()<k || colSort.size()<k){
                return new int[0][0];
            }
            int[] rowPosition = new int[k];
            int[] colPosition = new int[k];
            for(int i=0; i<k; i++){
                rowPosition[rowSort.get(i)] = i;
            }
            for(int i=0; i<k; i++){
                colPosition[colSort.get(i)] = i;
            }
            int[][] matrix = new int[k][k];
            for(int i=0; i<k; i++){
                matrix[rowPosition[i]][colPosition[i]] = i+1;
            }
            return matrix;
        }

        private List<Integer> getTopologicalSort(int[][] conditions, int k){
            List<List<Integer>> adj = new ArrayList<>();
            for(int i=0; i<k; i++){
                adj.add(new ArrayList<>());
            }
            int[] indegree = new int[k];
            for(int[] condition : conditions){
                adj.get(condition[0]-1).add(condition[1]-1);
                indegree[condition[1]-1]++;
            }
            Queue<Integer> q = new LinkedList<>();
            for(int i=0; i<k; i++){
                if(indegree[i]==0){
                    q.offer(i);
                }
            }
            List<Integer> topo = new ArrayList<>();
            while(!q.isEmpty()){
                int src = q.poll();
                topo.add(src);
                for(int nb : adj.get(src)){
                    indegree[nb]--;
                    if(indegree[nb]==0){
                        q.offer(nb);
                    }
                }
            }
            return topo;
        }
    }
}
