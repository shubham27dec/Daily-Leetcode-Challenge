import java.util.*;

public class July282024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int secondMinimum(int n, int[][] edges, int time, int change) {
            List<List<Integer>> adj = new ArrayList<>();
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>());
            }
            for(int[] edge : edges){
                adj.get(edge[0]-1).add(edge[1]-1);
                adj.get(edge[1]-1).add(edge[0]-1);
            }
            int[] time1 = new int[n];
            int[] time2 = new int[n];
            Arrays.fill(time1,-1);
            Arrays.fill(time2,-1);
            time1[0] = 0;
            int currTime = time;
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{0,1});
            while(!q.isEmpty()){
                int[] src = q.poll();
                currTime = src[1]==1?time1[src[0]]:time2[src[0]];
                if((currTime/change)%2==1){
                    currTime = ((currTime/change)+1)*change;
                }
                currTime += time;
                for(int nb : adj.get(src[0])){
                    if(time1[nb]==-1){
                        time1[nb] = currTime;
                        q.offer(new int[]{nb,1});
                    }
                    else if(time2[nb]==-1 && currTime!=time1[nb]){
                        if(nb==n-1){
                            return currTime;
                        }
                        time2[nb] = currTime;
                        q.offer(new int[]{nb,2});
                    }
                }
            }
            return -1;
        }
    }
}
