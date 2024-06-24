import java.util.LinkedList;
import java.util.Queue;

public class June242024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minKBitFlips(int[] nums, int k) {
            int ops = 0;
            int n = nums.length;
            Queue<Integer> q = new LinkedList<>();
            for(int i=0; i<n; i++){
                if(!q.isEmpty() && i>=q.peek()+k){
                    q.poll();
                }
                if((nums[i]+q.size())%2==0){
                    if(i+k>n){
                        return -1;
                    }
                    q.offer(i);
                    ops++;
                }
            }
            return ops;
        }
    }
}
