public class May052023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxVowels(String s, int k) {
            int start= 0;
            int end = k;
            int maxVowels = 0;
            int vowels = 0;
            for(int i=start; i<end; i++){
                char c = s.charAt(i);
                if(c=='a' || c =='e' || c=='i' || c=='o' || c=='u'){
                    vowels++;
                }
            }
            maxVowels = Math.max(vowels,maxVowels);
            while(end<s.length()){
                char c = s.charAt(end);
                if(c=='a' || c =='e' || c=='i' || c=='o' || c=='u'){
                    vowels++;
                }
                char ch = s.charAt(start);
                if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels--;
                }
                maxVowels = Math.max(vowels,maxVowels);
                end++;
                start++;
            }
            return maxVowels;
        }
    }
}
