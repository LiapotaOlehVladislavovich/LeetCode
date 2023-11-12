package rotate_list_61;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        int step = 0;
        ListNode fastPointer = head;

        while (step != k) {
            if (fastPointer != null) {
                fastPointer = fastPointer.next;
                step++;
            } else {
                fastPointer = head;
                k = k % step;
                step = 0;
            }
        }

        if (k == 0 || fastPointer == null) {
            return head;
        }

        ListNode slowPointer = head;

        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        fastPointer.next = head;
        head = slowPointer.next;
        slowPointer.next = null;

        return head;
    }
}
