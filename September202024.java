public class September202024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String shortestPalindrome(String s) {
            StringBuilder temp = new StringBuilder();
            for(int i=s.length(); i>1; i--){
                if(isPalindrome(s.substring(0,i))){
                    break;
                }
                else{
                    temp.append(s.charAt(i-1));
                }
            }
            return temp.toString() + s;
        }

        boolean isPalindrome(String s){
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if(s.charAt(i++)!=s.charAt(j--)){
                    return false;
                }
            }
            return true;
        }
    }
}
