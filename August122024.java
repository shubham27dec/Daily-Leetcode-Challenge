import java.util.PriorityQueue;

public class August122024 {
    public static void main(String[] args) {

    }
    class KthLargest {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for(int num : nums){
                pq.offer(num);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }

        public int add(int val) {
            pq.offer(val);
            if(pq.size()>k){
                pq.poll();
            }
            return pq.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
