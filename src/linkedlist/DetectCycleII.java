/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class DetectCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }
        ListNode ln1 = head, ln2 = slow;
        if(fast == null || fast.next == null) {
            return null;
        }
        while(ln1 != ln2) {
            ln1 = ln1.next;
            ln2 = ln2.next;
        }
        return ln1;
    }
}
