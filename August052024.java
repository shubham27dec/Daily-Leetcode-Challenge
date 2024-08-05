import java.util.HashMap;
import java.util.Map;

public class August052024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String kthDistinct(String[] arr, int k) {
            Map<String,Integer> stringFreq = new HashMap<>();
            for(String str : arr){
                stringFreq.put(str,stringFreq.getOrDefault(str,0)+1);
            }
            int count = 0;
            for(String str : arr){
                if(stringFreq.get(str)==1){
                    count++;
                    if(count==k){
                        return str;
                    }
                }
            }
            return "";
        }
    }
}
