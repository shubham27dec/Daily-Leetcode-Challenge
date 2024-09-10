public class September102024 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode insertGreatestCommonDivisors(ListNode head) {
            ListNode curr = head;
            while(curr.next!=null){
                ListNode next = curr.next;
                int gcd = findGCD(curr.val,next.val);
                ListNode temp = new ListNode(gcd,next);
                curr.next = temp;
                curr = next;
            }
            return head;
        }

        int findGCD(int a, int b){
            if(b==0){
                return a;
            }
            return findGCD(b,a%b);
        }
    }
}
