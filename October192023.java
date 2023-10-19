public class October192023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            StringBuilder sb = new StringBuilder();
            StringBuilder tb = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='#'){
                    if(sb.length()==0){
                        continue;
                    }
                    sb.deleteCharAt(sb.length()-1);
                }
                else{
                    sb.append(s.charAt(i));
                }
            }
            for(int i=0; i<t.length(); i++){
                if(t.charAt(i)=='#'){
                    if(tb.length()==0){
                        continue;
                    }
                    tb.deleteCharAt(tb.length()-1);
                }
                else{
                    tb.append(t.charAt(i));
                }
            }
            return sb.toString().equals(tb.toString());
        }
    }
}
