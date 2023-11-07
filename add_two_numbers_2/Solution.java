package add_two_numbers_2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = null;
        ListNode currentListNode = null;
        int sumResult;
        int cary = 0;

        while (l1 != null && l2 != null) {
            sumResult = l1.val + l2.val + cary;

            if (resultList == null) {
                resultList = new ListNode(sumResult % 10);
                currentListNode = resultList;
            } else {
                currentListNode.next = new ListNode(sumResult % 10);
                currentListNode = currentListNode.next;
            }

            cary = sumResult/10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sumResult = l1.val + cary;

            currentListNode.next = new ListNode(sumResult % 10);
            currentListNode = currentListNode.next;

            cary = sumResult/10;
            l1 = l1.next;
        }

        while (l2 != null) {
            sumResult = l2.val + cary;

            currentListNode.next = new ListNode(sumResult % 10);
            currentListNode = currentListNode.next;

            cary = sumResult/10;
            l2 = l2.next;
        }

        if (cary == 1) {
            currentListNode.next = new ListNode(cary);
        }

        return resultList;
    }
}
