public class July042024 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode mergeNodes(ListNode head) {
            ListNode curr = head.next;
            int currSum = 0;
            ListNode dummy = new ListNode(-1);
            ListNode ans = dummy;
            while(curr!=null && curr.next!=null){
                while(curr.val!=0){
                    currSum += curr.val;
                    curr = curr.next;
                }
                if(currSum!=0){
                    ListNode temp = new ListNode(currSum);
                    dummy.next = temp;
                    dummy = dummy.next;
                    currSum = 0;
                }
                curr = curr.next;
            }
            return ans.next;
        }
    }
}
