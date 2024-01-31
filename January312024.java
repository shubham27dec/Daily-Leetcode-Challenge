import java.util.Stack;

public class January312024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int numberOfDays = temperatures.length;
            int[] answer = new int[numberOfDays];
            Stack<Integer> waitingDays = new Stack<>();
            for(int i=0; i<numberOfDays; i++){
                while(!waitingDays.isEmpty() && temperatures[waitingDays.peek()] < temperatures[i]){
                    answer[waitingDays.peek()] = i-waitingDays.pop();
                }
                waitingDays.push(i);
            }
            return answer;
        }
    }
}
