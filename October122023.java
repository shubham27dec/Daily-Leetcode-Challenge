public class October122023 {
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     *     public int get(int index) {}
     *     public int length() {}
     * }
     */

    class Solution {
        public int findInMountainArray(int target, MountainArray mountainArr) {
            int peak=findPeak(mountainArr);
            int searchAsc = orderAgnosticBS(mountainArr,target, 0, peak);
            if(searchAsc!=-1) return searchAsc;
            return orderAgnosticBS(mountainArr,target, peak,mountainArr.length()-1);
        }

        int findPeak(MountainArray mountainArr){
            int start=0, end=mountainArr.length()-1;
            while(start<end){
                int mid = start + (end-start)/2;
                if(mountainArr.get(mid)>mountainArr.get(mid+1)) end=mid;
                else start= mid+1;
            }
            return start;
        }

        int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end){
            if(mountainArr.get(start)>mountainArr.get(end)){
                while(start<=end){
                    int mid = start + (end-start)/2;
                    int midEle = mountainArr.get(mid);
                    if(midEle==target) return mid;
                    else if(midEle<target) end=mid-1;
                    else start= mid+1;
                }
            }
            else{
                while(start<=end){
                    int mid = start + (end-start)/2;
                    int midEle = mountainArr.get(mid);
                    if(midEle==target) return mid;
                    else if(midEle>target) end=mid-1;
                    else start= mid+1;
                }
            }
            return -1;
        }
    }
}
