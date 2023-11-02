package odd_even_linked_list_328;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode lastOrderedOdd = head;
        ListNode lastOrderedEven = head.next;
        ListNode nextUnorderedOdd;

        while (lastOrderedEven != null && lastOrderedEven.next != null) {
            nextUnorderedOdd = lastOrderedEven.next;
            lastOrderedEven.next = nextUnorderedOdd.next;
            nextUnorderedOdd.next = lastOrderedOdd.next;
            lastOrderedOdd.next = nextUnorderedOdd;
            lastOrderedOdd = nextUnorderedOdd;
            lastOrderedEven = lastOrderedEven.next;
        }

        return head;
    }
}
