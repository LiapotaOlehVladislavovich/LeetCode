package remove_linked_list_elements_203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;
            }

            currentNode = currentNode.next;
        }

        return head;
    }
}
