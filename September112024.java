public class September112024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minBitFlips(int start, int goal) {
            String s = Integer.toBinaryString(start);
            String t = Integer.toBinaryString(goal);
            while(s.length()<32){
                s = '0' + s;
            }
            while(t.length()<32){
                t = '0' + t;
            }
            int ans = 0;
            for(int i=0; i<32; i++){
                if(s.charAt(i)!=t.charAt(i)){
                    ans++;
                }
            }
            return ans;
        }
    }
}
