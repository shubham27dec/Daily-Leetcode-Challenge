import java.util.*;

public class February062024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> anagramGroups = new ArrayList<>();
            int groupId = 0;
            Map<String,Integer> stringsWithGroupId = new HashMap<>();
            for(String str : strs){
                char[] strChars = str.toCharArray();
                Arrays.sort(strChars);
                String temp = new String(strChars);
                if(stringsWithGroupId.containsKey(temp)){
                    anagramGroups.get(stringsWithGroupId.get(temp)).add(str);
                }
                else{
                    stringsWithGroupId.put(temp,groupId++);
                    List<String> anagramGroup = new ArrayList<>();
                    anagramGroup.add(str);
                    anagramGroups.add(anagramGroup);
                }
            }
            return anagramGroups;
        }
    }
}
