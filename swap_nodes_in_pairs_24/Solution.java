package swap_nodes_in_pairs_24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode nextHead = head.next.next;
        head.next.next = head;
        head = head.next;
        head.next.next = swapPairs(nextHead);

        return head;
    }
}
