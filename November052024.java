public class November052024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minChanges(String s) {
            int changes = 0;
            int ones = 0;
            int zeroes = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    if(zeroes%2==1){
                        changes++;
                        zeroes = 0;
                        ones = 2;
                    }
                    else{
                        ones++;
                    }
                }
                else{
                    if(ones%2==1){
                        changes++;
                        zeroes = 0;
                        ones = 0;
                    }
                    else{
                        zeroes++;
                    }
                }
            }
            if(zeroes%2==1 || ones%2==1){
                changes++;
            }
            return changes;
        }
    }
}
