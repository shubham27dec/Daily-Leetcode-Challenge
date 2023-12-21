import java.util.Arrays;

public class December212023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxWidthOfVerticalArea(int[][] points) {
            Arrays.sort(points,(a, b) -> Integer.compare(a[0],b[0]));
            int maxDistance = 0;
            for(int i=1; i<points.length; i++){
                maxDistance = Math.max(maxDistance,points[i][0]-points[i-1][0]);
            }
            return maxDistance;
        }
    }
}
