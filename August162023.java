import java.util.ArrayDeque;
import java.util.Deque;

public class August162023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int[] ans = new int[n-k+1];
            Deque<Integer> window = new ArrayDeque<>();
            for(int i=0; i<n; i++){
                // remove out of bound indices
                while(window.size()>0 && window.peekFirst() <= i-k){
                    window.pollFirst();
                }

                // remove indices with values lower than nums[i]
                while(window.size()>0 && nums[window.peekLast()]<nums[i]){
                    window.pollLast();
                }

                // add i to deque
                window.offerLast(i);

                // add max of window to answer
                if(i>=k-1){
                    ans[i-k+1] = nums[window.peekFirst()];
                }
            }
            return ans;
        }
    }
}
