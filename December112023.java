public class December112023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int findSpecialInteger(int[] arr) {
            int reqFreq = arr.length/4 + 1;
            int currFreq = 1;
            for(int i=1; i<arr.length; i++){
                if(arr[i]!=arr[i-1]){
                    currFreq = 1;
                }
                else{
                    currFreq++;
                    if(currFreq==reqFreq){
                        return arr[i];
                    }
                }
            }
            return arr[0];
        }
    }
}
