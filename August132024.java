import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class August132024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> combinations = new ArrayList<>();
            Arrays.sort(candidates);
            List<Integer> combination = new ArrayList<>();
            combinationsSum(candidates,target,combinations,combination,0);
            return combinations;
        }

        private void combinationsSum(int[] candidates, int target, List<List<Integer>> combinations, List<Integer> combination, int i){
            if(target==0){
                combinations.add(new ArrayList<>(combination));
                return;
            }
            for(int ind = i; ind<candidates.length; ind++){
                if(ind>i && candidates[ind]==candidates[ind-1]){
                    continue;
                }
                if(candidates[ind]>target){
                    break;
                }
                combination.add(candidates[ind]);
                combinationsSum(candidates,target-candidates[ind],combinations,combination,ind+1);
                combination.remove(combination.size()-1);
            }

        }
    }
}
