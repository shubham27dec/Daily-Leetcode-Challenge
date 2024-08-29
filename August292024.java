import java.util.HashMap;
import java.util.Map;

public class August292024 {
    public static void main(String[] args) {

    }

    class Solution {
        public int removeStones(int[][] stones) {
            DisjointSet ds = new DisjointSet();

            // Union each stone's row and column (offset columns to make unique ids)
            for (int[] stone : stones) {
                ds.union(stone[0], stone[1] + 100001);
            }

            // Count the number of unique components
            Map<Integer, Integer> componentCount = new HashMap<>();
            for (int[] stone : stones) {
                int root = ds.find(stone[0]);
                componentCount.put(root, componentCount.getOrDefault(root, 0) + 1);
            }

            // The number of stones that can be removed is the total number of stones
            // minus the number of unique components
            return stones.length - componentCount.size();
        }
    }

    class DisjointSet {
        private Map<Integer, Integer> parent;
        private Map<Integer, Integer> rank;

        public DisjointSet() {
            parent = new HashMap<>();
            rank = new HashMap<>();
        }

        // Find the root of the set containing x, with path compression
        public int find(int x) {
            if (!parent.containsKey(x)) {
                parent.put(x, x);
                rank.put(x, 0);
            }
            if (parent.get(x) != x) {
                parent.put(x, find(parent.get(x))); // Path compression
            }
            return parent.get(x);
        }

        // Union the sets containing x and y, with union by rank
        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                int rankX = rank.get(rootX);
                int rankY = rank.get(rootY);
                if (rankX > rankY) {
                    parent.put(rootY, rootX);
                } else if (rankX < rankY) {
                    parent.put(rootX, rootY);
                } else {
                    parent.put(rootY, rootX);
                    rank.put(rootX, rankX + 1);
                }
            }
        }
    }
}
