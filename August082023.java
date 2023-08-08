public class August082023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int search(int[] nums, int target) {
            int pivot = findPivot(nums);
            int searchFirstHalf = binarySearch(nums,target,0,pivot);
            if(searchFirstHalf!=-1) return searchFirstHalf;
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }

        int findPivot(int[] arr){
            if(arr.length == 1 || arr[0]>arr[1]) return 0;
            int start=0, end=arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[end]>arr[start]) return end;
                if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
                if(mid<end && arr[mid]>arr[mid+1]) return mid;
                if(arr[mid]<arr[start]) end=mid-1;
                else start=mid+1;
            }
            return start;
        }

        int binarySearch(int[] arr, int target,int start, int end){
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]==target) return mid;
                else if(arr[mid]>target) end=mid-1;
                else start=mid+1;
            }
            return -1;
        }
    }
}
