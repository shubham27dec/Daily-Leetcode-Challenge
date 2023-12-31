import java.util.HashMap;
import java.util.Map;

public class December312023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxLengthBetweenEqualCharacters(String s) {
            Map<Character,Integer> firstCharOccurence = new HashMap<>();
            int longestSubstring = -1;
            for(int i=0; i<s.length(); i++){
                firstCharOccurence.putIfAbsent(s.charAt(i),i);
                longestSubstring = Math.max(longestSubstring,i-firstCharOccurence.get(s.charAt(i)));
            }
            return longestSubstring-1;
        }
    }
}
