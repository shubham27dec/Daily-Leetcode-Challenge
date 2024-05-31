public class May312024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] singleNumber(int[] nums) {
            int xor = 0;
            for(int num : nums){
                xor ^= num;
            }
            int diff = 1;
            while(true){
                if((xor&diff)!=0){
                    break;
                }
                diff = diff<<1;
            }
            int num1 = 0;
            int num2 = 0;
            for(int num : nums){
                if((num&diff)==0){
                    num1 ^= num;
                }
                else{
                    num2 ^= num;
                }
            }
            return new int[]{num1,num2};
        }
    }
}
