import java.util.PriorityQueue;

public class July242024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] sortJumbled(int[] mapping, int[] nums) {
            long[] mappedNums = new long[nums.length];
            for(int i=0; i<nums.length; i++){
                long mappedNum = 0l;
                int num = nums[i];
                int pow = 0;
                if(num==0){
                    mappedNums[i] = mapping[0];
                    continue;
                }
                while(num>0){
                    int digit = mapping[(num%10)];
                    digit *= Math.pow(10,pow++);
                    mappedNum += digit;
                    num /= 10;
                }
                mappedNums[i] = mappedNum;
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
                if(mappedNums[a]==mappedNums[b]){
                    return Integer.compare(a,b);
                }
                return Long.compare(mappedNums[a],mappedNums[b]);
            });
            int[] sortedNums = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                pq.offer(i);
            }
            for(int i=0; i<nums.length; i++){
                sortedNums[i] = nums[pq.poll()];
            }
            return sortedNums;
        }
    }
}
