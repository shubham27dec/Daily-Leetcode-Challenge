import java.util.HashMap;

public class June092024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int subarraysDivByK(int[] nums, int k) {
            int ans = 0;
            int sum = 0;
            HashMap<Integer,Integer> remFrequency = new HashMap<>();
            remFrequency.put(0,1);
            for(int num : nums){
                sum += num;
                int rem = sum%k;
                if(rem<0){
                    rem += k;
                }
                if(remFrequency.containsKey(rem)){
                    ans += remFrequency.get(rem);
                }
                remFrequency.put(rem,remFrequency.getOrDefault(rem,0)+1);
            }
            return ans;
        }
    }
}
