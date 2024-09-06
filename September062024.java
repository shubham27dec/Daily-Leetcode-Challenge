import java.util.HashSet;
import java.util.Set;

public class September062024 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode modifiedList(int[] nums, ListNode head) {
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num);
            }
            while(head!=null && set.contains(head.val)){
                head = head.next;
            }
            ListNode curr = head;
            while(curr!=null){
                if(curr.next!=null && set.contains(curr.next.val)){
                    curr.next = curr.next.next;
                }
                else{
                    curr = curr.next;
                }
            }
            return head;
        }
    }
}
