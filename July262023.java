public class July262023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minSpeedOnTime(int[] dist, double hour) {
            if(hour<=dist.length-1){
                return -1;
            }
            int minSpeed = 1;
            int maxSpeed = 1000000000;
            int reqSpeed = 0;
            while(minSpeed <= maxSpeed){
                int currSpeed = minSpeed + (maxSpeed-minSpeed)/2;
                double h = findHours(dist,currSpeed);
                if(h>hour){
                    minSpeed = currSpeed+1;
                }
                else{
                    reqSpeed = currSpeed;
                    maxSpeed = currSpeed-1;
                }
            }
            return reqSpeed;
        }

        double findHours(int[] dist, int currSpeed){
            double hours = 0.0;
            for(int i=0; i<dist.length-1; i++){
                int h = dist[i] / currSpeed;
                if(dist[i]%currSpeed != 0){
                    h++;
                }
                hours +=h;
            }
            double h = dist[dist.length-1]/(currSpeed * 1.0);
            hours += h;
            return hours;
        }
    }
}
