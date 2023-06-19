public class June192023 {

    public static void main(String[] args) {

    }

    class Solution {
        public int largestAltitude(int[] gain) {
            int currentAltitude = 0;
            int highestAltitude = 0;
            for(int altitude:gain){
                currentAltitude += altitude;
                highestAltitude = Math.max(highestAltitude,currentAltitude);
            }
            return highestAltitude;
        }
    }
}
