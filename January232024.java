import java.util.HashSet;
import java.util.List;

public class January232024 {
    public static void main(String[] args) {

    }
    class Solution {

        public int maxLength(List<String> arr) {
            HashSet<Character> set = new HashSet<>();
            return backtrack(arr, 0, set);
        }

        public int backtrack(List<String> arr,int i, HashSet<Character> set){
            if(i==arr.size()){
                return set.size();
            }
            int res=0;
            if(!overlap(arr.get(i),set)){
                for(int k=0;k<arr.get(i).length();k++){
                    set.add(arr.get(i).charAt(k));
                }
                res = backtrack(arr,i+1,set) ;
                for(int k=0;k<arr.get(i).length();k++){
                    set.remove(arr.get(i).charAt(k));
                }
            }
            return Math.max(res,backtrack(arr,i+1,set) );
        }
        public boolean overlap(String str, HashSet<Character> set){
            HashSet<Character> prev = new HashSet<>();
            for(int k=0;k<str.length();k++){
                char c = str.charAt(k);
                if(set.contains(c)||prev.contains(c)){
                    return true;
                }
                prev.add(c);
            }
            return false;
        }
    }
}
