public class April112024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String removeKdigits(String num, int k) {
            int n = num.length();
            if(n==k){
                return "0";
            }
            StringBuilder sb = new StringBuilder(num);
            int i=0;
            while(i<sb.length()-1 && k>0){
                if(sb.charAt(i)>sb.charAt(i+1)){
                    sb.deleteCharAt(i);
                    k--;
                    if(i>0){
                        i--;
                    }
                }
                else{
                    i++;
                }
            }
            i = sb.length()-1;
            if(k>0){
                while(i>0 && k>0){
                    if(sb.charAt(i)>=sb.charAt(i-1)){
                        sb.deleteCharAt(i);
                        k--;
                    }
                    i--;
                }
            }
            while(sb.length()!=0 && sb.charAt(0)=='0'){
                sb.deleteCharAt(0);
            }
            return sb.length()==0?"0":sb.toString();
        }
    }
}
