import java.util.HashMap;
import java.util.Map;

public class March162024 {
    public static void main(String[] args) {
        class Solution {
            public int findMaxLength(int[] nums) {
                int currSum = 0;
                int maxSubarray = 0;
                Map<Integer,Integer> prefixSum = new HashMap<>();
                int n = nums.length;
                for(int i=0; i<n; i++){
                    if(nums[i]==0){
                        currSum--;
                    }
                    else{
                        currSum++;
                    }
                    int currSubarray = i-prefixSum.getOrDefault(currSum,i);
                    prefixSum.putIfAbsent(currSum, i);
                    maxSubarray = Math.max(maxSubarray, currSubarray);
                    if(currSum==0){
                        maxSubarray = Math.max(maxSubarray, i+1);
                    }
                }
                return maxSubarray;
            }
        }
    }
}
