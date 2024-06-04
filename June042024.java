public class June042024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int longestPalindrome(String s) {
            int[] charFreq = new int[128];
            for(char c : s.toCharArray()){
                charFreq[c]++;
            }
            boolean odd = false;
            int answer = 0;
            for(int freq : charFreq){
                if(freq%2==1){
                    answer += (freq-1);
                    odd = true;
                }
                else{
                    answer += freq;
                }
            }
            return odd?answer+1 : answer;
        }
    }
}
