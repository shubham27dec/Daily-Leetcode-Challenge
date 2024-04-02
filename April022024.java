import java.util.HashMap;
import java.util.Map;

public class April022024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            Map<Character,Character> keyMapping = new HashMap<>();
            Map<Character,Character> valueMapping = new HashMap<>();
            int n = s.length();
            for(int i=0; i<n; i++){
                char key = s.charAt(i);
                char value = t.charAt(i);
                if(keyMapping.containsKey(key)){
                    if(keyMapping.get(key)!=value){
                        return false;
                    }
                }
                if(valueMapping.containsKey(value)){
                    if(valueMapping.get(value)!=key){
                        return false;
                    }
                }
                keyMapping.put(key,value);
                valueMapping.put(value,key);
            }
            return true;
        }
    }
}
