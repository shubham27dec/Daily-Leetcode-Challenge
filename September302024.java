public class September302024 {
    public static void main(String[] args) {

    }
    class CustomStack {

        class StackNode{
            int val;
            StackNode up;
            StackNode down;

            StackNode(int val){
                this.val = val;
                this.up = null;
                this.down = null;
            }
        }

        StackNode top;
        StackNode bottom;
        int capacity;
        int size;

        public CustomStack(int maxSize) {
            this.top = new StackNode(-1);
            this.bottom = new StackNode(-1);
            this.capacity = maxSize;
            this.size = 0;
            top.down = bottom;
            bottom.up = top;
        }

        public void push(int x) {
            if(size==capacity){
                return;
            }
            StackNode temp = top.down;
            top.down = new StackNode(x);
            top.down.up = top;
            top.down.down = temp;
            temp.up = top.down;
            size++;
        }

        public int pop() {
            if(size==0){
                return -1;
            }
            StackNode temp = top.down;
            top.down = temp.down;
            temp.down.up = top;
            size--;
            return temp.val;
        }

        public void increment(int k, int val) {
            StackNode temp = top.down;
            while(temp.down!=null){
                temp = temp.down;
            }
            temp = temp.up;
            while(k-->0 && temp.up!=null){
                temp.val += val;
                temp = temp.up;
            }
        }
    }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
}
