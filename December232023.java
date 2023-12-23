import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class December232023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isPathCrossing(String s) {
            Set<List<Integer>> visited = new HashSet<>();
            int x=0, y=0;
            visited.add(List.of(x,y));
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='N'){
                    y++;
                }
                else if(s.charAt(i)=='E'){
                    x++;
                }
                else if(s.charAt(i)=='S'){
                    y--;
                }
                else if(s.charAt(i)=='W'){
                    x--;
                }
                if(visited.contains(List.of(x,y))){
                    return true;
                }
                visited.add(List.of(x,y));
            }
            return false;
        }
    }
}
