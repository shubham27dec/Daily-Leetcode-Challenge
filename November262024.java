public class November262024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findChampion(int n, int[][] edges) {
            int[] indegree = new int[n];
            for(int[] edge : edges){
                indegree[edge[1]]++;
            }
            int champion = 0;
            int numChampions = 0;
            for(int i=0; i<n; i++){
                if(indegree[i]==0){
                    champion = i;
                    numChampions++;
                    if(numChampions==2){
                        return -1;
                    }
                }
            }
            return numChampions==1?champion:-1;
        }
    }
}
