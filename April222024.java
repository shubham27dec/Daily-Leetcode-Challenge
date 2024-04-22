import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class April222024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int openLock(String[] deadends, String target) {
            Set<String> deadEnds = new HashSet<>();
            if(target.equals("0000")){
                return 0;
            }
            for(String deadEnd : deadends){
                deadEnds.add(deadEnd);
            }
            if(deadEnds.contains("0000")){
                return -1;
            }
            Set<String> visited = new HashSet<>();
            Queue<String> states = new LinkedList<>();
            states.offer("0000");
            visited.add("0000");
            int moves = 0;
            while(!states.isEmpty()){
                int size = states.size();
                for(int j=0; j<size; j++){
                    String state = states.poll();
                    for(int i=0; i<4; i++){
                        StringBuilder sb = new StringBuilder(state);
                        char c = sb.charAt(i);
                        if(c=='9'){
                            sb.setCharAt(i,'0');
                        }
                        else{
                            sb.setCharAt(i,(char)(c+1));
                        }
                        String s = sb.toString();
                        if(s.equals(target)){
                            return moves+1;
                        }
                        if(!visited.contains(s) && !deadEnds.contains(s)){
                            visited.add(s);
                            states.offer(s);
                        }
                        if(c=='0'){
                            sb.setCharAt(i,'9');
                        }
                        else{
                            sb.setCharAt(i,(char)(c-1));
                        }
                        s = sb.toString();
                        if(s.equals(target)){
                            return moves+1;
                        }
                        if(!visited.contains(s) && !deadEnds.contains(s)){
                            visited.add(s);
                            states.offer(s);
                        }
                    }
                }
                moves++;
            }
            return -1;
        }
    }
}
