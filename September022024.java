public class September022024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int chalkReplacer(int[] chalk, int k) {
            int loopReq = 0;
            for(int j=0; j<chalk.length; j++){
                if(chalk[j]>k){
                    return j;
                }
                k -= chalk[j];
                loopReq += chalk[j];
            }
            while(k>=loopReq){
                k -= loopReq;
            }
            for(int j=0; j<chalk.length; j++){
                if(chalk[j]>k){
                    return j;
                }
                k -= chalk[j];
            }
            return -1;
        }
    }
}
