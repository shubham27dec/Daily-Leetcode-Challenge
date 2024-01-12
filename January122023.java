public class January122023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean halvesAreAlike(String s) {
            int vowelsCount = 0;
            for(int i=0; i<s.length()/2; i++){
                char c = s.toLowerCase().charAt(i);
                switch(c){
                    case 'a' -> vowelsCount++;
                    case 'e' -> vowelsCount++;
                    case 'i' -> vowelsCount++;
                    case 'o' -> vowelsCount++;
                    case 'u' -> vowelsCount++;
                }
            }

            for(int i=s.length()-1; i>=s.length()/2; i--){
                char c = s.toLowerCase().charAt(i);
                switch(c){
                    case 'a' -> vowelsCount--;
                    case 'e' -> vowelsCount--;
                    case 'i' -> vowelsCount--;
                    case 'o' -> vowelsCount--;
                    case 'u' -> vowelsCount--;
                }
            }
            return vowelsCount==0;
        }
    }
}
