public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode a=headA, b=headB;
        
        while (a != null || b != null) {
            if (a != null) {
                if (set.contains(a)) return a;
                else {
                    set.add(a);
                    a = a.next;
                }
            }
            
            if (b != null) {
                if (set.contains(b)) return b;
                else {
                    set.add(b);
                    b = b.next;
                }
            }
        }
        
        return null;
    }
}
