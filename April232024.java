import java.util.*;

public class April232024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            if(n==1){
                return new ArrayList<>(Arrays.asList(0));
            }
            List<Integer> answer = new ArrayList<>(); // O(n)
            int minHeight = n;
            List<List<Integer>> adj = new ArrayList<>();  //[]   O(n)
            for(int node=0; node<n; node++){   // [[1],[0,2,3],[1],[1]]   // O(n)
                adj.add(new ArrayList<>());
            }
            int[] inDegree = new int[n];
            for(int[] edge : edges){                             // O(n)
                adj.get(edge[0]).add(edge[1]);
                adj.get(edge[1]).add(edge[0]);
            }
            for(int node=0; node<n; node++){   // [[1],[0,2,3],[1],[1]]   // O(n)
                inDegree[node] = adj.get(node).size();
            }
            //Map<Integer,Integer> rootHeight = new HashMap<>();   // O(n)
            //for(int root=0; root<n; root++){
            //    if(adj.get(root).size()==1){
            //        continue;
            //    }
            //boolean[] visited = new boolean[n];

            Queue<Integer> q = new LinkedList<>();
            for(int node=0; node<n; node++){
                if(inDegree[node]==1){
                    q.offer(node);
                }
            }
            while(!q.isEmpty()){
                int size = q.size();
                answer.clear();
                for(int i=0; i<size; i++){
                    int src = q.poll();
                    answer.add(src);
                    for(int dest : adj.get(src)){
                        //if(!visited[dest]){
                        inDegree[dest]--;
                        if(inDegree[dest]==1){
                            q.offer(dest);
                        }
                        //}
                    }
                }
            }
            return answer;
        }
    }


// TC O(n)
// SC  O(n)
}
