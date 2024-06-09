import java.util.HashMap;

public class June082024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean checkSubarraySum(int[] nums, int k) {
            int sum = 0;
            HashMap<Integer,Integer> rems = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                sum += nums[i];
                int rem = sum%k;
                if((i>0 && rem==0) || (rems.containsKey(rem) && (i-rems.get(rem))>1)){
                    return true;
                }
                rems.putIfAbsent(rem,i);
            }
            return false;
        }
    }
}
