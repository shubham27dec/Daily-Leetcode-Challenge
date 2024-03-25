import java.util.ArrayList;
import java.util.List;

public class March252024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> duplicates = new ArrayList<>();
            int i=0;
            int n = nums.length;
            while(i<n){
                if(nums[i] != i+1){
                    int correctIndex = nums[i]-1;
                    if(nums[correctIndex] == nums[i]){
                        i++;
                    }
                    else{
                        nums[i] = nums[correctIndex];
                        nums[correctIndex] = correctIndex+1;
                    }
                }
                else{
                    i++;
                }
            }
            for(int j=0; j<n; j++){
                if(nums[j] != j+1){
                    duplicates.add(nums[j]);
                }
            }
            return duplicates;
        }
    }
}
