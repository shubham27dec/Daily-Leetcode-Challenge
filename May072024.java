public class May072024 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode doubleIt(ListNode head) {
            ListNode tail = reverse(head);
            ListNode dummy = new ListNode(-1);
            ListNode answer = dummy;
            ListNode curr = tail;
            int val = 0;
            int carry = 0;
            while(curr!=null){
                val = curr.val * 2 + carry;
                carry = val/10;
                val %= 10;
                ListNode node = new ListNode(val);
                answer.next = node;
                answer = answer.next;
                curr = curr.next;
            }
            if(carry>0){
                ListNode node = new ListNode(carry);
                answer.next = node;
                answer = answer.next;
            }
            answer.next = null;
            reverse(tail);
            return reverse(dummy.next);
        }

        private ListNode reverse(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            while(curr!=null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }
}
