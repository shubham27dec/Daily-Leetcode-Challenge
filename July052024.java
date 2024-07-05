public class July052024 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            int firstCP = 100001;
            int lastCP = 0;
            int criticalPoints = 0;
            int minDistance = -1;
            int maxDistance = -1;
            ListNode prev = head;
            ListNode curr = prev.next;
            int prevVal = prev.val;
            int currVal = curr.val;
            int index = 1;
            while(curr.next!=null){
                ListNode next = curr.next;
                int nextVal = next.val;
                if((currVal > prevVal && currVal > nextVal) || (currVal < prevVal && currVal < nextVal)){
                    criticalPoints++;
                    if(firstCP==100001){
                        firstCP = index;
                    }
                    else{
                        if(minDistance == -1){
                            minDistance = index - lastCP;
                            maxDistance = index - lastCP;
                        }
                        else{
                            minDistance = Math.min(minDistance,index-lastCP);
                            maxDistance = index - firstCP;
                        }
                    }
                    lastCP = index;
                }
                index++;
                prevVal = currVal;
                currVal = nextVal;
                curr = next;
            }
            return criticalPoints<2?new int[]{-1,-1} : new int[]{minDistance,maxDistance};
        }
    }
}
