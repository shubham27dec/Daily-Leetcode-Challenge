import java.util.PriorityQueue;

public class July222024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(heights[b],heights[a]));
            for(int i=0; i<heights.length; i++){
                pq.offer(i);
            }
            String[] sortedNames = new String[names.length];
            int index=0;
            while(!pq.isEmpty()){
                sortedNames[index++] = names[pq.poll()];
            }
            return sortedNames;
        }
    }
}
