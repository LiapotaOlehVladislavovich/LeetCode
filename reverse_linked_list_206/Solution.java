package reverse_linked_list_206;

public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseList(head, head);
    }

    private ListNode reverseList(ListNode head, ListNode current) {
        if (current == null || current.next == null) {
            return head;
        }

        ListNode savingNode = current.next;
        current.next = current.next.next;
        savingNode.next = head;
        head = savingNode;


        return reverseList(head, current);
    }
}
