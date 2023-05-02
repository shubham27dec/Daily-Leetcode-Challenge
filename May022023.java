public class May022023 {
    public static void main(String[] args) {

    }
    public int arraySign(int[] nums) {
        int negativeNums = 0;
        for(int num : nums){
            if(num==0){
                return 0;
            }
            else if(num<0){
                negativeNums++;
            }
        }
        if(negativeNums%2==1){
            return -1;
        }
        return 1;
    }
}
