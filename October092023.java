public class October092023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int firstOccurence = -1, lastOccurence = -1, start=0, end=nums.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(nums[mid]<target){
                    start=mid+1;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    firstOccurence = mid;
                    lastOccurence = mid;
                    while(firstOccurence>start && nums[firstOccurence-1]==target){
                        firstOccurence--;
                    }
                    while(lastOccurence<end && nums[lastOccurence+1]==target){
                        lastOccurence++;
                    }
                    break;
                }
            }
            return new int[]{firstOccurence,lastOccurence};
        }
    }
}
