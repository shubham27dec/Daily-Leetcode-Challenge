import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class January022024 {
    public static void main(String[] args) {
        System.out.println(Solution.findMatrix(new int[] {1,3,4,1,2,3,1}));
    }
    class Solution {
        public static List<List<Integer>> findMatrix(int[] nums) {
            Map<Integer,Integer> numFreq = new HashMap<>();
            for(int num : nums){
                numFreq.put(num,numFreq.getOrDefault(num,0)+1);
            }
            int rowsAdded = 0;
            List<List<Integer>> matrix = new ArrayList<>();
            for(int num : numFreq.keySet()){
                int freq = numFreq.get(num);
                if(freq > rowsAdded){
                    for(int i=0; i<(freq-rowsAdded); i++){
                        matrix.add(new ArrayList<>());
                    }
                    rowsAdded = freq;
                }
                for(int i=0; i<freq; i++){
                    matrix.get(i).add(num);
                }
            }
            return matrix;
        }
    }
}
