public class October012023 {
    public static void main(String[] args) {

    }
    class Solution {
        public String reverseWords(String s) {
            String ans = "";
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)==' '){
                    ans += sb.reverse().toString();
                    ans += " ";
                    sb = new StringBuilder();
                }
                else{
                    sb.append(s.charAt(i));
                }
            }
            ans += sb.reverse().toString();
            return ans;
        }
    }
}
