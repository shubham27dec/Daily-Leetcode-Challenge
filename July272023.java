public class July272023 {
    public static void main(String[] args) {

    }
    class Solution {
        public long maxRunTime(int n, int[] batteries) {
            long minTime = batteries[0];
            long maxTime = 0;
            for(int battery : batteries){
                minTime = Math.min(minTime,battery);
                maxTime += battery;
            }
            maxTime /= n;
            long reqTime = 0;
            while(minTime <= maxTime){
                long currTime = minTime + (maxTime - minTime)/2;
                if(sufficientBattery(currTime,n,batteries)){
                    reqTime = currTime;
                    minTime = currTime+1;
                }
                else{
                    maxTime = currTime-1;
                }
            }
            return reqTime;
        }

        boolean sufficientBattery(long time, int n, int[] batteries){
            long timePassed = 0;
            for(int battery : batteries){
                timePassed += Math.min(time,battery);
            }
            return timePassed >= time*n;
        }
    }
}
