public class August102023 {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean search(int[] nums, int target) {
            int pivot = findPivot(nums);
            int searchFirstHalf = binarySearch(nums,target,0,pivot);
            if(searchFirstHalf!=-1) return true;
            int searchSecondHalf = binarySearch(nums,target,pivot+1,nums.length-1);
            if(searchSecondHalf!=-1) return true;
            return false;
        }

        int findPivot(int[] arr){
            if(arr.length==1 || arr[0]>arr[1]) return 0;
            int start=0, end = arr.length-1;
            int mid=start + (end-start)/2;
            while(start<=end){
                if(arr[end]>arr[start]) return end;
                mid = start + (end-start)/2;
                if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
                if(mid<end && arr[mid]>arr[mid+1]) return mid;
                if(arr[start] > arr[mid]) end=mid-1;
                else if(arr[start] ==  arr[mid] && arr[end]==arr[mid]){
                    start++;
                    end--;
                }
                else start=mid+1;
            }
            return mid;
        }

        int binarySearch(int[] arr, int target, int start, int end){
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target) return mid;
                else if(arr[mid]>target) end=mid-1;
                else start=mid+1;
            }
            return -1;
        }
    }
}
