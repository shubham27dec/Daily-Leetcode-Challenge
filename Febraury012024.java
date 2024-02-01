import java.util.Arrays;

public class Febraury012024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[][] divideArray(int[] nums, int k) {
            int i=0, index = 0, n = nums.length;
            Arrays.sort(nums);
            int[][] answer = new int[n/3][3];
            while(i<n){
                int first = nums[i];
                int second = nums[i+1];
                int third = nums[i+2];
                if(third-first > k){
                    return new int[0][0];
                }
                answer[index][0] = first;
                answer[index][1] = second;
                answer[index][2] = third;
                i += 3;
                index++;
            }
            return answer;
        }
    }
}
