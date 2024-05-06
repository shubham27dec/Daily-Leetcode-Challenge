public class May062024 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode removeNodes(ListNode head) {
            ListNode tail = reverse(head);
            ListNode curr = tail;
            while(curr!=null && curr.next!=null){
                if(curr.val > curr.next.val){
                    curr.next = curr.next.next;
                }
                else{
                    curr = curr.next;
                }
            }
            return reverse(tail);
        }

        private ListNode reverse(ListNode head){
            ListNode prev = null;
            while(head!=null){
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
    }
}
