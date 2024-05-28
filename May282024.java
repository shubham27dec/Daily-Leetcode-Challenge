public class May282024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int equalSubstring(String s, String t, int maxCost) {
            int currCost = 0;
            int left = 0;
            int maxLength = 0;
            for(int right=0; right<s.length(); right++){
                currCost += (Math.abs(s.charAt(right)-t.charAt(right)));
                while(currCost>maxCost){
                    currCost -= (Math.abs(s.charAt(left)-t.charAt(left)));
                    left++;
                }
                maxLength = Math.max(maxLength,right-left+1);
            }
            return maxLength;
        }
    }
}
