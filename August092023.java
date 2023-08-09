import java.util.Arrays;

public class August092023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minimizeMax(int[] nums, int p) {
            Arrays.sort(nums);
            int n = nums.length;
            int low=0, high=nums[n-1]-nums[0];
            while(low<high){
                int mid= low + (high-low)/2;
                if(solve(nums,mid,p)){
                    high=mid;
                }else{
                    low = mid+1;
                }
            }
            return low;
        }

        boolean solve(int[] nums, int d, int p){
            int n = nums.length;
            int count = 0;
            for(int i=0; i<n-1; i++){
                if(nums[i+1]-nums[i] <= d){
                    count++;
                    i++;
                }
                if(count>=p){
                    return true;
                }
            }
            return false;
        }
    }
}
