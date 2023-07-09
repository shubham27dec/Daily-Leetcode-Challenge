import java.util.HashSet;
import java.util.Set;

public class July092023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int largestVariance(String s) {
            int temp1 = 0, temp2 = 0, answer = 0;
            Set<Character> set = new HashSet<>();
            for(char c: s.toCharArray()){
                set.add(c);
            }
            for(int k = 0;k<2;k++){
                for(char a: set){
                    for(char b: set){
                        if(a==b){
                            continue;
                        }
                        temp1 = temp2 = 0;
                        for(char i: s.toCharArray()){
                            if(i==a){
                                temp1++;
                            }else if(i==b){
                                temp2++;
                            }
                            if(temp1<temp2){
                                temp1 = temp2 = 0;
                            }
                            else if(temp1>0 && temp2>0){
                                answer = Math.max(answer, temp1- temp2);
                            }
                        }
                    }
                }
                s = new StringBuilder(s).reverse().toString();
            }
            return answer;
        }
    }
}
