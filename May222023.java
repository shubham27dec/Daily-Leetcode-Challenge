import java.util.HashMap;
import java.util.PriorityQueue;

public class May222023 {
    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int num:nums){
            frequency.put(num,frequency.getOrDefault(num,0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->frequency.get(b) - frequency.get(a));
        pq.addAll(frequency.keySet());
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}
