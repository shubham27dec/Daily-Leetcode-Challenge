public class August032024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            int[] numFreq = new int[1001];
            for(int num : arr){
                numFreq[num]++;
            }
            for(int num : target){
                numFreq[num]--;
            }
            for(int freq : numFreq){
                if(freq!=0){
                    return false;
                }
            }
            return true;
        }
    }
}
