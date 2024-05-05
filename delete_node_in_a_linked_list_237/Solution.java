package delete_node_in_a_linked_list_237;

public class Solution {
    /**
     * Method removes the given node from linked list, without changing links.
     *
     * @param node node of list that need to be deleted
     * @see ListNode
     * */
    public void deleteNode(ListNode node) {
        //Create pointer at current node
        ListNode pointer = node;

        //While next node won`t become last
        while (pointer.next.next != null) {
            //Change current value to value of the next node
            pointer.val = pointer.next.val;
            //Move pointer to the next node
            pointer = pointer.next;
        }

        //Change current value to value of the next node
        pointer.val = pointer.next.val;
        //Set link to the next node as null to represent that current node is last
        pointer.next = null;
    }
}