public class November092023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countHomogenous(String s) {
            long homogenous = 0;
            long count = 1;
            for(int i=0; i<s.length(); i++){
                count = 1;
                while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                    count++;
                    i++;
                }
                homogenous += ((count*(count+1))/2);
            }
            return (int)(homogenous%1000000007);
        }
    }
}
