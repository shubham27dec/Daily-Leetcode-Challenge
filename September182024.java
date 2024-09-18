import java.util.Arrays;

public class September182024 {
    public static void main(String[] args) {

    }
    class Solution {
        public String largestNumber(int[] nums) {
            String[] strings = new String[nums.length];
            for(int i=0; i<nums.length; i++){
                strings[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(strings,(b, a)->(a+b).compareTo(b+a));
            StringBuilder sb = new StringBuilder();
            for(String str : strings){
                sb.append(str);
            }
            return sb.charAt(0)=='0'?"0":sb.toString();
        }
    }
}
