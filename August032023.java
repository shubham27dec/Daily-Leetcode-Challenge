import java.util.ArrayList;
import java.util.List;

public class August032023 {
    public static void main(String[] args) {

    }
    class Solution {
        public List<String> letterCombinations(String digits) {
            return combinations("",digits);
        }
        private List<String> combinations(String p, String up){

            if(up.isEmpty()){
                List<String> combs = new ArrayList<>();
                if(!p.equals("")) combs.add(p);
                return combs;
            }
            int digit = up.charAt(0) - '0'  ;

            List<String> combs = new ArrayList<>();

            if(digit<7){
                for(int i= (digit-2)*3; i< (digit-1)*3; i++){
                    char ch = (char) ('a' + i);
                    combs.addAll(combinations(p+ch,up.substring(1)));
                }
            }

            else if(digit==7){
                for(int i= (digit-2)*3; i< ((digit-1)*3)+1; i++){
                    char ch = (char) ('a' + i);
                    combs.addAll(combinations(p+ch,up.substring(1)));
                }
            }

            else if(digit==8){
                for(int i= ((digit-2)*3) + 1; i< ((digit-1)*3)+1; i++){
                    char ch = (char) ('a' + i);
                    combs.addAll(combinations(p+ch,up.substring(1)));
                }
            }

            else{
                for(int i= ((digit-2)*3) + 1; i< ((digit-1)*3)+2; i++){
                    char ch = (char) ('a' + i);
                    combs.addAll(combinations(p+ch,up.substring(1)));
                }
            }

            return combs;
        }
    }
}
