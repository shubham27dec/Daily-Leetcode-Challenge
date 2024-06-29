import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class June292024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> getAncestors(int n, int[][] edges) {
            int[] indegree = new int[n];
            List<List<Integer>> adj = new ArrayList<>();
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>());
            }
            for(int[] edge : edges){
                adj.get(edge[1]).add(edge[0]);
            }
            List<List<Integer>> ancestors = new ArrayList<>();
            for(int i=0; i<n; i++){
                ancestors.add(new ArrayList<>());
            }
            for(int i=0; i<n; i++){
                getAncestors(i, adj, ancestors, new boolean[n], i);
            }
            for(List<Integer> ancs : ancestors){
                Collections.sort(ancs);
            }
            return ancestors;
        }

        void getAncestors(int src, List<List<Integer>> adj, List<List<Integer>> ancestors, boolean[] visited, int curr){
            visited[src] = true;
            for(int nb : adj.get(src)){
                if(!visited[nb]){
                    ancestors.get(curr).add(nb);
                    getAncestors(nb,adj,ancestors,visited,curr);
                }
            }
        }
    }
}
