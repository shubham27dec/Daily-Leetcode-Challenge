public class March212023 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head==null || head.next==null){
                return head;
            }
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = head.next;
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }
}
