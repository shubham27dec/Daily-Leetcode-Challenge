public class June112024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] freq = new int[1001];
            for(int ele : arr1){
                freq[ele]++;
            }
            int i=0;
            for(int ele : arr2){
                while(freq[ele]-->0){
                    arr1[i++] = ele;
                }
            }
            for(int ele=0; ele<1001; ele++){
                while(freq[ele]-->0){
                    arr1[i++] = ele;
                }
            }
            return arr1;
        }
    }
}
