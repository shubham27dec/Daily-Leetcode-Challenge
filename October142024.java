import java.util.PriorityQueue;

public class October142024 {
    public static void main(String[] args) {

    }
    class Solution {
        public long maxKelements(int[] nums, int k) {
            long score = 0;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b)->Integer.compare(b,a));
            for(int num : nums){
                maxHeap.offer(num);
            }
            for(int i=0; i<k; i++){
                int num = maxHeap.poll();
                score += num;
                maxHeap.offer((int)Math.ceil(num/3.0));
            }
            return score;
        }
    }
}
