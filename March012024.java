public class March012024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            char[] charArray = s.toCharArray();
            int onePos = 0;
            int n = s.length();
            for(int i=0; i<n-1; i++){
                if(charArray[i]=='1'){
                    if(charArray[n-1]=='0'){
                        charArray[n-1] = '1';
                    }
                    else {
                        charArray[onePos++] = '1';
                    }
                    if(i!=onePos-1 && i!=n-1){
                        charArray[i] = '0';
                    }
                }
            }
            return String.valueOf(charArray);
        }
    }
}
