public class September282024 {
    public static void main(String[] args) {

    }
    class MyCircularDeque {

        class Node{
            int val;
            Node next;
            Node prev;

            Node(int val){
                this.val = val;
                this.next = null;
                this.prev = null;
            }
        }

        Node head;
        Node tail;
        int capacity;
        int size;

        public MyCircularDeque(int k) {
            head = new Node(-1);
            tail = new Node(-1);
            capacity = k;
            size = 0;
            tail.next = head;
            tail.prev = head;
            head.next = tail;
            head.prev = tail;
        }

        public boolean insertFront(int value) {
            if(capacity==size){
                return false;
            }
            Node temp = head.next;
            head.next = new Node(value);
            head.next.next = temp;
            head.next.prev = head;
            temp.prev = head.next;
            size++;
            return true;
        }

        public boolean insertLast(int value) {
            if(capacity==size){
                return false;
            }
            Node temp = tail.prev;
            tail.prev = new Node(value);
            tail.prev.prev = temp;
            tail.prev.next = tail;
            temp.next = tail.prev;
            size++;
            return true;
        }

        public boolean deleteFront() {
            if(size==0){
                return false;
            }
            head.next.next.prev = head;
            head.next = head.next.next;
            size--;
            return true;
        }

        public boolean deleteLast() {
            if(size==0){
                return false;
            }
            tail.prev.prev.next = tail;
            tail.prev = tail.prev.prev;
            size--;
            return true;
        }

        public int getFront() {
            if(size==0){
                return -1;
            }
            return head.next.val;
        }

        public int getRear() {
            if(size==0){
                return -1;
            }
            return tail.prev.val;
        }

        public boolean isEmpty() {
            return size==0;
        }

        public boolean isFull() {
            return size==capacity;
        }
    }

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
}
