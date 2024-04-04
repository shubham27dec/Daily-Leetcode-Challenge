public class April042024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxDepth(String s) {
            int depth = 0;
            int maxDepth = 0;
            int n = s.length();
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='('){
                    depth++;
                    maxDepth = Math.max(depth,maxDepth);
                }
                else if(s.charAt(i)==')'){
                    depth--;
                }
            }
            return maxDepth;
        }
    }
}
