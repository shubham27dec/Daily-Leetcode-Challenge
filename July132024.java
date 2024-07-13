import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class July132024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
            PriorityQueue<Integer> sortedPositionIndexes = new PriorityQueue<>((a, b) -> Integer.compare(positions[a],positions[b]));
            int n = positions.length;
            Stack<Integer> st = new Stack<>();
            for(int i=0; i<n; i++){
                sortedPositionIndexes.offer(i);
            }
            while(!sortedPositionIndexes.isEmpty()){
                int currIndex = sortedPositionIndexes.poll();
                if(directions.charAt(currIndex)=='R'){
                    st.push(currIndex);
                }
                else{
                    while(!st.isEmpty() && healths[currIndex]>healths[st.peek()]){
                        healths[st.pop()] = 0;
                        healths[currIndex]--;
                    }
                    if(!st.isEmpty() && healths[currIndex]==healths[st.peek()]){
                        healths[st.pop()] = 0;
                        healths[currIndex] = 0;
                    }
                    else if(!st.isEmpty() && healths[currIndex]<healths[st.peek()]){
                        healths[currIndex] = 0;
                        healths[st.peek()]--;
                    }
                }
            }
            List<Integer> ans = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(healths[i]>0){
                    ans.add(healths[i]);
                }
            }
            return ans;
        }
    }
}
