import java.util.PriorityQueue;

public class December122024 {
    public static void main(String[] args) {

    }
    class Solution {
        public long pickGifts(int[] gifts, int k) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b,a));
            for(int gift : gifts){
                maxHeap.add(gift);
            }
            while(k-->0){
                int gift = maxHeap.poll();
                if(gift==1){
                    return maxHeap.size()+1;
                }
                int leftBehind = (int)Math.sqrt(gift);
                maxHeap.offer(leftBehind);
            }
            long giftsRemaining = 0;
            while(!maxHeap.isEmpty()){
                int gift = maxHeap.poll();
                if(gift==1){
                    return giftsRemaining + maxHeap.size() + 1;
                }
                giftsRemaining += gift;
            }
            return giftsRemaining;
        }
    }
}
