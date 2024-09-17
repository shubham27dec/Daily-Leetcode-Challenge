import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class September172024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String[] uncommonFromSentences(String s1, String s2) {
            List<String> uncommon = new ArrayList<>();
            String[] arr1 = s1.split(" ");
            String[] arr2 = s2.split(" ");
            Map<String,Integer> wordFreq = new HashMap<>();
            for(String str : arr1){
                wordFreq.put(str,wordFreq.getOrDefault(str,0)+1);
            }
            for(String str : arr2){
                wordFreq.put(str,wordFreq.getOrDefault(str,0)+1);
            }
            for(String str : wordFreq.keySet()){
                if(wordFreq.get(str)==1){
                    uncommon.add(str);
                }
            }
            String[] ans = new String[uncommon.size()];
            for(int i=0; i<ans.length; i++){
                ans[i] = uncommon.get(i);
            }
            return ans;
        }
    }
}
