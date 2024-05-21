import java.util.ArrayList;
import java.util.List;

public class May212024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            int n = nums.length;
            int sets = 1<<n;
            List<List<Integer>> subsets = new ArrayList<>();
            for(int i=0; i<sets; i++){
                List<Integer> subset = new ArrayList<>();
                int index = i;
                for(int j=0; j<n; j++){
                    if((index&1)==1){
                        subset.add(nums[j]);
                    }
                    index = index>>1;
                }
                subsets.add(subset);
            }
            return subsets;
        }
    }
}
