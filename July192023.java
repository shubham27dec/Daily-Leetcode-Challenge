import java.util.Arrays;

public class July192023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> (a[1]-b[1]));
            int endTime = Integer.MIN_VALUE;
            int ans = 0;
            for(int i=0; i<intervals.length; i++){
                if(intervals[i][0]<endTime){
                    ans++;
                }
                else{
                    endTime = intervals[i][1];
                }
            }
            return ans;
        }
    }
}
