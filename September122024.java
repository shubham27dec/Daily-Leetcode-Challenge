public class September122024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            int ans = 0;
            for(int i=0; i<words.length; i++){
                boolean isConsistent=  true;
                for(int j=0; j<words[i].length(); j++){
                    if(allowed.indexOf(String.valueOf(words[i].charAt(j)))==-1){
                        isConsistent = false;
                        break;
                    }
                }
                if(isConsistent) ans++;
            }
            return ans;
        }
    }
}
