import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class March102024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i=0, j=0, n=nums1.length, m=nums2.length;
            List<Integer> temp = new ArrayList<>();
            while(i<n && j<m){
                while((i<n-1 && nums1[i]==nums1[i+1]) || (i<n && j<m && nums1[i]<nums2[j])){
                    i++;
                }
                while((j<m-1 && nums2[j]==nums2[j+1]) || (j<m && i<n && nums1[i]>nums2[j])){
                    j++;
                }
                if(i<n && j<m && nums1[i]==nums2[j]){
                    temp.add(nums1[i]);
                    i++;
                    j++;
                }
            }
            int[] intersection = new int[temp.size()];
            int index = 0;
            for(int ele : temp){
                intersection[index++] = ele;
            }
            return intersection;
        }
    }
}
