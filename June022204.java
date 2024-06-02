public class June022204 {
    public static void main(String[] args) {

    }
    class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length-1;
            while(left<right){
                swap(s,left++,right--);
            }
        }

        void swap(char[] s, int left, int right){
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
        }
    }
}
