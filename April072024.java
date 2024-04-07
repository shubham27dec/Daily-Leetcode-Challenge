public class April072024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean checkValidString(String s) {
            int n = s.length();
            int maxOpen = 0;
            int minOpen = 0;
            for(int i=0; i<n; i++){
                char c = s.charAt(i);
                if(c==')'){
                    maxOpen--;
                    minOpen--;
                    if(maxOpen < 0){
                        return false;
                    }
                    if(minOpen < 0){
                        minOpen = 0;
                    }
                }
                else if(c == '*'){
                    minOpen--;
                    if(minOpen<0){
                        minOpen = 0;
                    }
                    maxOpen++;
                }
                else{
                    minOpen++;
                    maxOpen++;
                }
            }
            return minOpen==0;
        }
    }
}
