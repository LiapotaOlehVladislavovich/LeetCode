package intersection_of_two_linked_lists_160;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;

        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA != null) {
            lengthA++;
            currentA = currentA.next;
        }

        while (currentB != null) {
            lengthB++;
            currentB = currentB.next;
        }

        currentA = headA;
        currentB = headB;

        while (lengthA > lengthB) {
            lengthA--;
            currentA = currentA.next;
        }

        while (lengthB > lengthA) {
            lengthB--;
            currentB = currentB.next;
        }

        while (currentA != currentB) {
            currentA = currentA.next;
            currentB = currentB.next;
        }

        return currentA;
    }
}
