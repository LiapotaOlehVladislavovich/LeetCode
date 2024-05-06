package remove_nodes_from_linked_list_2487;

public class Solution {
    /**
     * Method removes every node which has a node with a greater value anywhere
     * to the right side of it in a single linked list.
     *
     * @param head head of the single linked list
     * @return the head of modified list
     * */
    public ListNode removeNodes(ListNode head) {
        // if the last node
        if (head.next == null) {
            // return the node itself
            return head;
        }

        // get the next maximum node
        ListNode nextMax = removeNodes(head.next);

        // if current node is lesser than next maximum
        if (head.val < nextMax.val) {
            // return maximum
            return nextMax;
        }

        // save the current nod and set next as next maximum
        head.next = nextMax;
        // return current node
        return head;
    }
}