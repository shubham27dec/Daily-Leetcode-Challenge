import java.util.HashMap;

public class July182023 {
    public static void main(String[] args) {

    }
    class LRUCache {

        class Node {
            int key;
            int val;
            Node next;
            Node prev;

            public Node(int key, int val){
                this.key = key;
                this.val = val;
                next = null;
                prev = null;
            }
        }

        HashMap<Integer, Node> cache;
        Node MRU;
        Node LRU;
        int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cache = new HashMap<>();
            MRU = new Node(-1,-1);
            LRU = new Node(-1,-1);
            MRU.next = LRU;
            LRU.prev = MRU;
        }

        private void addNode(Node newNode) {
            Node temp = MRU.next;
            MRU.next = newNode;
            newNode.prev = MRU;
            newNode.next = temp;
            temp.prev = newNode;
        }

        private void deleteNode(Node node){
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
        }

        public int get(int key) {
            if(!cache.containsKey(key)){
                return -1;
            }
            put(key,cache.get(key).val);
            return cache.get(key).val;
        }

        public void put(int key, int value) {
            if(cache.containsKey(key)){
                Node node = cache.get(key);
                deleteNode(node);
                node.val = value;
                addNode(node);
                cache.put(key,MRU.next);
            }
            else{
                if(cache.size() == capacity){
                    Node prev = LRU.prev;
                    deleteNode(prev);
                    cache.remove(prev.key);
                }
                Node newNode = new Node(key,value);
                addNode(newNode);
                cache.put(key, MRU.next);
            }
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
