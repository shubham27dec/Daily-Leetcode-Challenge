import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class May032023 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int ele1 : nums1){
            if(!list1.contains(ele1) && !binarySearch(nums2,ele1)){
                list1.add(ele1);
            }
        }
        for(int ele2 : nums2){
            if(!list2.contains(ele2) && !binarySearch(nums1,ele2)){
                list2.add(ele2);
            }
        }
        answer.add(list1);
        answer.add(list2);
        return answer;

    }

    private boolean binarySearch(int[] nums, int num){
        int start = 0, end= nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==num){
                return true;
            }
            if(nums[mid]>num){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
