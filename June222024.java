public class June222024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numberOfSubarrays(int[] nums, int k) {
            // this type of questions where exact number of subarrays satisfying some condition is needed to be found (not atleast or atmost) cannot be solved directly as we will encounter situations where we won't know whether to extend the window or shrink it.
            // so these type of questions need to solved using a neat trick where we calculate atmost k and atmost k-1 and return their difference as the answer.
            return numberOfSubarraysAtmostkOdd(nums,k) - numberOfSubarraysAtmostkOdd(nums,k-1);
        }

        int numberOfSubarraysAtmostkOdd(int[] nums,int k){
            int odds = 0;
            int subarrays = 0;
            int left = 0;
            for(int right=0; right<nums.length; right++){
                if(nums[right]%2==1){
                    odds++;
                }
                while(odds>k){
                    if(nums[left++]%2==1){
                        odds--;
                    }
                }
                subarrays += right-left+1;
            }
            return subarrays;
        }
    }
}
