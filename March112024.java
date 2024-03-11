public class March112024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String customSortString(String order, String s) {
            char[] sChars = s.toCharArray();
            for(int i=0; i<sChars.length-1; i++){
                for(int j=i+1; j<sChars.length; j++){
                    if(order.indexOf(sChars[i])>order.indexOf(sChars[j])){
                        char c = sChars[i];
                        sChars[i] = sChars[j];
                        sChars[j] = c;
                    }
                }
            }
            return String.valueOf(sChars);
        }
    }
}
