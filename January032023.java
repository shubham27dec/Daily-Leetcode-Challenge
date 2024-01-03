public class January032023 {
    public static void main(String[] args) {

    }
    class Solution {
        public int numberOfBeams(String[] bank) {
            int prevFloorDevice = 0;
            int beamsCount = 0;
            for(String floor : bank){
                int currFloorDevice = countDevice(floor);
                if(currFloorDevice!=0){
                    if(prevFloorDevice!=0){
                        beamsCount += (currFloorDevice*prevFloorDevice);
                    }
                    prevFloorDevice = currFloorDevice;
                }
            }
            return beamsCount;
        }

        int countDevice(String floor){
            int deviceCount = 0;
            for(char c : floor.toCharArray()){
                if(c=='1'){
                    deviceCount++;
                }
            }
            return deviceCount;
        }
    }
}
