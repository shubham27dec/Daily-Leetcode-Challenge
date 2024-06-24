import java.util.PriorityQueue;

public class June232024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int longestSubarray(int[] nums, int limit) {
            int n = nums.length;
            int maxLength = 1;                         // 1
            int left = 0;
            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b)->Integer.compare(a[0],b[0]));
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
            for(int right=0; right<n; right++){
                minHeap.offer(new int[]{nums[right],right});
                maxHeap.offer(new int[]{nums[right],right});
                while(maxHeap.peek()[0]-minHeap.peek()[0]>limit){
                    left = Math.min(maxHeap.peek()[1],minHeap.peek()[1]) + 1;
                    while(maxHeap.peek()[1]<left){
                        maxHeap.poll();
                    }
                    while(minHeap.peek()[1]<left){
                        minHeap.poll();
                    }
                }
                maxLength = Math.max(maxLength,right-left+1);
            }
            return maxLength;
        }
    }
}
