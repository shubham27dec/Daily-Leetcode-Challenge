public class March202024 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            // Create a dummy node to handle cases where the removal starts from the head of list1
            ListNode dummy = new ListNode(0);
            dummy.next = list1;

            // Traverse to the (a-1)th node
            ListNode current = dummy;
            for (int i = 0; i < a; i++) {
                current = current.next;
            }

            // Save the reference to the (a-1)th node
            ListNode beforeA = current;

            // Traverse to the bth node
            for (int i = a; i <= b; i++) {
                current = current.next;
            }

            // Save the reference to the (b+1)th node
            ListNode afterB = current.next;

            // Connect the (a-1)th node to list2
            beforeA.next = list2;

            // Traverse to the end of list2
            while (list2.next != null) {
                list2 = list2.next;
            }

            // Connect the end of list2 to the (b+1)th node
            list2.next = afterB;

            return dummy.next;
        }
    }
}
