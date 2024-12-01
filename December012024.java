import java.util.HashSet;
import java.util.Set;

public class December012024 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean checkIfExist(int[] arr) {
            Set<Integer> nums = new HashSet<>();
            for(int i=0; i<arr.length; i++){
                if(nums.contains(arr[i]*2) || (arr[i]%2==0 && nums.contains(arr[i]/2))){
                    return true;
                }
                nums.add(arr[i]);
            }
            return false;
        }
    }
}
