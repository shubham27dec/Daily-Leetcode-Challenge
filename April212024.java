import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class April212024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            if(source==destination){
                return true;
            }
            List<List<Integer>> adj = new ArrayList<>();
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>());
            }
            for(int[] edge : edges){
                adj.get(edge[0]).add(edge[1]);
                adj.get(edge[1]).add(edge[0]);
            }
            Queue<Integer> q = new LinkedList<>();
            boolean[] visited = new boolean[n];
            q.offer(source);
            visited[source] = true;
            while(!q.isEmpty()){
                int src = q.poll();
                for(int dest : adj.get(src)){
                    if(dest==destination){
                        return true;
                    }
                    if(!visited[dest]){
                        q.offer(dest);
                        visited[dest] = true;
                    }
                }
            }
            return false;
        }
    }
}
