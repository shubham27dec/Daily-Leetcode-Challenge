public class March132024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int pivotInteger(int n) {
            int totalSum=(n*(n+1))/2;
            int currSum = 0;
            for(int i=1; i<=n; i++){
                currSum += i;
                if(currSum == totalSum){
                    return i;
                }
                totalSum -= i;
            }
            return -1;
        }
    }
}
