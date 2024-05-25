import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class May252024 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<String> wordBreak(String s, List<String> wordDict) {
            Set<String> dict = new HashSet<>();
            for(String word : wordDict){
                dict.add(word);
            }
            List<String> answer = new ArrayList<>();
            solve(0,s,dict,answer,new StringBuilder());
            return answer;
        }

        void solve(int index, String s, Set<String> dict, List<String> answer, StringBuilder sb){
            if(index==s.length()){
                answer.add(sb.toString());
                return;
            }
            for(int i=index; i<s.length(); i++){
                if(dict.contains(s.substring(index,i+1))){
                    if(sb.length()!=0){
                        sb.append(" ");
                    }
                    sb.append(s.substring(index,i+1));
                    solve(i+1,s,dict,answer,sb);
                    int lastIndex = sb.lastIndexOf(" ");
                    if(lastIndex==-1){
                        lastIndex=0;
                    }
                    sb.delete(lastIndex,sb.length());
                }
            }
        }
    }
}
