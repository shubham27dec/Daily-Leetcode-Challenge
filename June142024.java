import java.util.Arrays;

public class June142024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minIncrementForUnique(int[] nums) {
            Arrays.sort(nums);
            int candidate = 0;
            int count = 0;
            for(int num : nums){
                candidate = Math.max(candidate,num);
                count += (candidate - num);
                candidate++;
            }
            return count;
        }
    }
}
