public class October092024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minAddToMakeValid(String s) {
            int toAdd = 0;
            int open = 0;
            for(char c : s.toCharArray()){
                if(c=='('){
                    open++;
                }
                else if(c==')'){
                    if(open==0){
                        toAdd++;
                    }
                    else{
                        open--;
                    }
                }
            }
            return toAdd + open;
        }
    }
}
