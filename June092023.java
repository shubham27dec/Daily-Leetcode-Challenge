public class June092023 {

    public static void main(String[] args) {

    }

    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            //if(target>=letters[letters.length-1]) return letters[0];
            int start=0, end=letters.length-1;

            while(start<=end){
                int mid = start + (end-start)/2;
                //if(letters[mid] == target) return letters[mid+1];
                if(letters[mid]>target) end=mid-1;
                if(letters[mid]<=target) start=mid+1;
            }
            return letters[start%letters.length];
            // for(int i=0; i<letters.length; i++){
            //     if(letters[i]>target) return letters[i];
            // }
            // return letters[0];
        }
    }
}
