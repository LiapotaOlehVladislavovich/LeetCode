package double_a_number_represented_as_a_linked_list_2816;

public class Solution {
    /**
     * Method doubles the number represented by single linked list
     *
     * @param head head of a non-empty linked list representing a non-negative integer without leading zeroes
     * @return head of the linked list after doubling it.
     * */
    public ListNode doubleIt(ListNode head) {
        // if head node will produce carry-over digit after doubling
        if (head.val > 4) {
            // insert a new node at the beginning
            head = new ListNode(0, head);
        }

        // Traverse the linked list
        for (ListNode pointer = head; pointer != null; pointer = pointer.next) {
            // Double the value of the current node and update it with the units digit
            pointer.val = (pointer.val * 2) % 10;

            // If the current node has a next node and the next node will produce carry-over digit after doubling
            if (pointer.next != null && pointer.next.val > 4) {
                // increment the current node's value to handle carry
                pointer.val++;
            }
        }

        // return head
        return head;
    }
}