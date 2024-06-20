public class June192024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minDays(int[] bloomDay, int m, int k) {
            int n = bloomDay.length;
            if(n<m*k){
                return -1;
            }
            int low = Integer.MAX_VALUE;
            int high = 0;
            for(int i=0; i<n; i++){
                low = Math.min(low,bloomDay[i]);
                high = Math.max(high,bloomDay[i]);
            }
            int minDays = -1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(isPossible(bloomDay,m,k,mid)){
                    minDays = mid;
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            return minDays;
        }

        boolean isPossible(int[] bloomDay, int m, int k, int mid){
            int flowers = 0;
            int n = bloomDay.length;
            for(int i=0; i<n ; i++){
                if(bloomDay[i]<=mid){
                    flowers++;
                    if(flowers==k){
                        m--;
                        flowers=0;
                    }
                }
                else{
                    flowers = 0;
                }
            }
            return m<=0;
        }
    }
}
