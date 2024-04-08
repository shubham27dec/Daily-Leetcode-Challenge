import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class April082024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countStudents(int[] students, int[] sandwiches) {
            Queue<Integer> q = new LinkedList<>();
            Stack<Integer> st = new Stack<>();
            for(int i=sandwiches.length-1; i>=0; i--){
                st.push(sandwiches[i]);
            }
            for(int student : students){
                q.offer(student);
            }
            while(!st.isEmpty()){
                int size = q.size();
                boolean taken = false;
                for(int i=0; i<size; i++){
                    int student = q.poll();
                    if(st.peek()==student){
                        st.pop();
                        taken = true;
                    }
                    else{
                        q.offer(student);
                    }
                }
                if(!taken){
                    return st.size();
                }
            }
            return 0;
        }
    }
}
