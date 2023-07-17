import java.util.Stack;

public class July172023 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Stack<Integer> st1 = new Stack<>();
            Stack<Integer> st2 = new Stack<>();
            while(l1!=null){
                st1.push(l1.val);
                l1=l1.next;
            }
            while(l2!=null){
                st2.push(l2.val);
                l2=l2.next;
            }
            int sum = 0, carry = 0;
            ListNode ans = null, newNode;
            while(!st1.isEmpty() || !st2.isEmpty()){
                if(!st1.isEmpty()){
                    sum += st1.pop();
                }
                if(!st2.isEmpty()){
                    sum += st2.pop();
                }
                sum += carry;
                carry = sum/10;
                newNode = new ListNode(sum%10);
                newNode.next = ans;
                ans = newNode;
                sum = 0;
            }
            if(carry!=0){
                newNode = new ListNode(carry);
                newNode.next = ans;
                ans = newNode;
            }
            return ans;
        }
    }
}
