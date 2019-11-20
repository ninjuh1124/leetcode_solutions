public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode p1 = head, p2 = head;
 
        // detect loop
        do {
            p1 = p1.next;
            if (p1.next == null) return null;
            else p1 = p1.next;
            
            if (p1.next == null) return null;
            else p2 = p2.next;
        } while (p1 != p2);
        
        p2 = head;
        
        // find first node in loop
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return p1;
    }
}
