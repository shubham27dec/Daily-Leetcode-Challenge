public class June212024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
            int totalSatisfaction = 0;
            int maxGrumpyWindow = 0;
            int currGrumpyWindow = 0;
            int left = 0;
            for(int right=0; right<customers.length; right++){
                totalSatisfaction += ((1-grumpy[right])*customers[right]);
                currGrumpyWindow += ((grumpy[right])*customers[right]);
                if(right-left==minutes-1){
                    maxGrumpyWindow = Math.max(maxGrumpyWindow,currGrumpyWindow);
                    currGrumpyWindow -= ((grumpy[left])*customers[left]);
                    left++;
                }
            }
            return totalSatisfaction + maxGrumpyWindow;
        }
    }
}
