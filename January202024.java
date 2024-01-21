import java.util.Stack;

public class January202024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int sumSubarrayMins(int[] arr) {

            long sumSubarrayMins = 0;
            Stack<Integer> st = new Stack<>();

            for(int i=0; i<=arr.length; i++){
                while(!st.isEmpty() && (i==arr.length || arr[st.peek()] >= arr[i])){
                    int index = st.peek();
                    st.pop();

                    long right = i<arr.length ? i-index : arr.length-index;
                    long left = st.empty() ? index+1: index-st.peek();

                    sumSubarrayMins += (left*right*arr[index]);
                }
                st.push(i);
            }

            return (int)(sumSubarrayMins%1000000007);
        }
    }
}
