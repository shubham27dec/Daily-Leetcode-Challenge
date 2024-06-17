import java.util.HashSet;
import java.util.Set;

public class June172024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean judgeSquareSum(int c) {
            Set<Long> squares = new HashSet<>();
            for(long i=0; i*i<=c; i++){
                long square = i*i;
                long diff = c-square;
                if(squares.contains(diff) || square+square==c){
                    return true;
                }
                squares.add(square);
            }
            return false;
        }
    }
}
