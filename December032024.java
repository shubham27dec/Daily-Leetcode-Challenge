public class December032024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String addSpaces(String s, int[] spaces) {
            StringBuilder str = new StringBuilder();
            int prev = 0;
            for(int space : spaces){
                str.append(s.substring(prev,space));
                str.append(" ");
                prev = space;
            }
            str.append(s.substring(prev,s.length()));
            return str.toString();
        }
    }
}
