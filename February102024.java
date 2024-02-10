public class February102024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countSubstrings(String s) {
            int n = s.length();
            int count = n;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(isPalindromic(s.substring(i,j+1))){
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean isPalindromic(String s){
            int n = s.length();
            for(int i=0; i<n/2; i++){
                if(s.charAt(i)!=s.charAt(n-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
}
