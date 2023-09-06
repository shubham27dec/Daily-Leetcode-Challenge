public class September062023 {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode[] splitListToParts(ListNode head, int k) {
            int length = 0;
            ListNode current = head;
            ListNode[] parts = new ListNode[k];
            while(current!=null){
                length++;
                current = current.next;
            }
            int baseSize = length/k;
            int extraNodes = length%k;
            current=head;
            for(int i=0; i<k; i++){
                int partSize = baseSize + (extraNodes-->0?1:0);
                ListNode partHead = null, partTail=null;
                for(int j=0; j<partSize; j++){
                    if(partHead==null){
                        partHead=partTail=current;
                    }
                    else{
                        partTail.next=current;
                        partTail=partTail.next;
                    }
                    if(current!=null){
                        current=current.next;
                    }
                }
                if(partTail!=null){
                    partTail.next = null;
                }
                parts[i] = partHead;
            }
            return parts;
        }
    }
}
