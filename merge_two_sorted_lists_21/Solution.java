package merge_two_sorted_lists_21;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultHead = null;
        ListNode currentResultNode = null;
        int newNodeValue;

        while (list1 != null && list2 != null) {
           if (list1.val < list2.val) {
               newNodeValue = list1.val;
               list1 = list1.next;
           } else {
               newNodeValue = list2.val;
               list2 = list2.next;
           }

           if (resultHead == null) {
               resultHead = new ListNode(newNodeValue);
               currentResultNode = resultHead;
           } else {
               currentResultNode.next = new ListNode(newNodeValue);
               currentResultNode = currentResultNode.next;
           }
        }

        if (currentResultNode != null) {
            if (list1 != null) {
                currentResultNode.next = list1;
            } else {
                currentResultNode.next = list2;
            }
        } else {
            if (list1 != null) {
                resultHead = list1;
            } else {
                resultHead = list2;
            }
        }

        return resultHead;
    }
}
