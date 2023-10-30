package remove_nth_node_from_end_of_list_19;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int step = 0;
        ListNode firstPointer = head;

        while (step != n) {
            firstPointer = firstPointer.next;
            step++;
        }

        ListNode secondPointer = head;

        if (firstPointer == null) {
            return head.next;
        }

        while (firstPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        secondPointer.next = secondPointer.next.next;

        return head;
    }
}
