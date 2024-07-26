import java.util.Arrays;

public class July262024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findTheCity(int n, int[][] edges, int distanceThreshold) {
            int[][] distance = new int[n][n];
            for(int[] dist : distance){
                Arrays.fill(dist,20001);
            }
            for(int[] edge : edges){
                int src = edge[0];
                int dst = edge[1];
                int dist = edge[2];
                distance[src][dst] = dist;
                distance[dst][src] = dist;
            }
            for (int i = 0; i < n; i++) {
                distance[i][i] = 0;
            }
            for(int via=0; via<n; via++){
                for(int src=0; src<n; src++){
                    for(int dst=0; dst<n; dst++){
                        distance[src][dst] = Math.min(distance[src][dst],distance[src][via] + distance[via][dst]);
                    }
                }
            }
            int reqCity = 0;
            int minNeighbours = n;
            for(int src=0; src<n; src++){
                int currNeighbours = -1;
                for(int dst=0; dst<n; dst++){
                    if(distance[src][dst] <= distanceThreshold){
                        currNeighbours++;
                    }
                }
                if(currNeighbours<=minNeighbours){
                    minNeighbours = currNeighbours;
                    reqCity = src;
                }
            }
            return reqCity;
        }
    }
}
