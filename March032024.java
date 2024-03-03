public class March032024 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow = head;
            ListNode fast = head;
            for(int i=0; i<n; i++){
                fast = fast.next;
            }
            if(fast==null){
                return head.next;
            }
            while(fast.next!=null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }
}
