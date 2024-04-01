public class April012024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int lengthOfLastWord(String s) {
            int n = s.length();
            while(s.charAt(n-1)==' '){
                n--;
            }
            int length = 0;
            for(int i=n-1; i>=0; i--){
                if(s.charAt(i)==' '){
                    return length;
                }
                length++;
            }
            return length;
        }
    }
}
