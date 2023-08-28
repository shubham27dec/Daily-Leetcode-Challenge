import java.util.LinkedList;
import java.util.Queue;

public class August282023 {
    public static void main(String[] args) {

    }
    class MyStack {
        Queue<Integer> q = new LinkedList<>();
    public MyStack() {

        }

        public void push(int x) {
            q.add(x);
            int v = q.size()-1;
            int i=0;
            while(i<v){
                q.add(q.poll());
                i++;
            }
        }

        public int pop() {
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }
}
