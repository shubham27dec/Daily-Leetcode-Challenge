import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class June032023 {

    public static void main(String[] args) {

    }

    class Solution {
        private int dfs(int manager, int[] informTime, Map<Integer, List<Integer>> adjList) {
            int maxTime = 0;
            if (adjList.containsKey(manager)) {
                for (int subordinate : adjList.get(manager)) {
                    maxTime = Math.max(maxTime, dfs(subordinate, informTime, adjList));
                }
            }
            return maxTime + informTime[manager];
        }

        public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
            Map<Integer, List<Integer>> adjList = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (manager[i] != -1) {
                    adjList.computeIfAbsent(manager[i], k -> new ArrayList<>()).add(i);
                }
            }

            return dfs(headID, informTime, adjList);
        }
    }

}
