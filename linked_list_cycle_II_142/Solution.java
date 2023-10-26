package linked_list_cycle_II_142;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                break;
            }
        }

        if (fastPointer == null || fastPointer.next == null) return null;

        while (head != slowPointer) {
            head = head.next;
            slowPointer = slowPointer.next;
        }

        return head;
    }
}
