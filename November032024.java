public class November032024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean rotateString(String s, String goal) {
            if(s.length()!=goal.length()){
                return false;
            }
            s = s + s;
            return s.contains(goal);
        }
    }
}
