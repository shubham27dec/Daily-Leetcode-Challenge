import java.util.ArrayList;
import java.util.List;

public class July022024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            int[] nums1Freq = new int[1001];
            int[] nums2Freq = new int[1001];
            for(int num1 : nums1){
                nums1Freq[num1]++;
            }
            for(int num2 : nums2){
                nums2Freq[num2]++;
            }
            List<Integer> answer = new ArrayList<>();
            for(int i=0; i<1001; i++){
                for(int j=0; j<Math.min(nums1Freq[i],nums2Freq[i]); j++){
                    answer.add(i);
                }
            }
            int[] intersection = new int[answer.size()];
            for(int i=0; i<answer.size(); i++){
                intersection[i] = answer.get(i);
            }
            return intersection;
        }
    }
}
