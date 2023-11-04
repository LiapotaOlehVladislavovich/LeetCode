package palindrome_linked_list_234;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean result = true;

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        ListNode previousPointer = slowPointer;
        slowPointer = slowPointer.next;
        previousPointer.next = null;
        ListNode nodeSaver;

        while (slowPointer != null) {
            nodeSaver = slowPointer.next;
            slowPointer.next = previousPointer;
            previousPointer = slowPointer;
            slowPointer = nodeSaver;
        }

        fastPointer = head;
        slowPointer = previousPointer;

        while (slowPointer != null) {
            if (fastPointer.val != slowPointer.val) {
                result = false;
                slowPointer = null;
            } else {
                fastPointer = fastPointer.next;
                slowPointer = slowPointer.next;
            }
        }

        return result;
    }
}
