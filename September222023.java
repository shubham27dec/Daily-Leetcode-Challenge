public class September222023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int sp = 0;
            int tp = 0;
            while(sp<s.length() && tp<t.length()){
                if(s.charAt(sp)==t.charAt(tp)){
                    sp++;
                }
                tp++;
            }
            return sp==s.length();
        }
    }
}
